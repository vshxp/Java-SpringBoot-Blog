package com.appteste.appteste.security;

import com.appteste.appteste.controller.dto.UserDto;
import com.appteste.appteste.repository.UserRepository;
import com.google.gson.Gson;
import io.jsonwebtoken.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;


@Service
public class JwtProvider {
    @Value("${jwt.secret}")
    private String secret;
    private final UserRepository userRepository;

    public JwtProvider(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String generateToken(Authentication authentication) {
        User principal = (User) authentication.getPrincipal();
        String userName = principal.getUsername();
        com.appteste.appteste.model.User info = getUserInfo(userName);

        return Jwts.builder()
                .setSubject(new Gson().toJson(new UserDto(info.getId(),
                        info.getName(),
                        info.getPassword(),
                        info.getEmail())))
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }

    private com.appteste.appteste.model.User getUserInfo(String email) {
        return userRepository.findByEmail(email).orElseThrow();
    }

    public boolean validateToken(String jwt) {
        Jwts.parser().setSigningKey(secret).parseClaimsJws(jwt).getBody();
        return true;
    }

    public UserDto getTokenUser(String token) {
        Claims claims = Jwts.parser()
                .setSigningKey(secret)
                .parseClaimsJws(token)
                .getBody();
        return new Gson().fromJson(claims.getSubject(), UserDto.class);
    }
}
