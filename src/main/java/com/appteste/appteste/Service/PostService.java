package com.appteste.appteste.Service;

import com.appteste.appteste.Controller.dto.PostDto;
import com.appteste.appteste.Model.Post;
import com.appteste.appteste.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public void save(PostDto p) {
        postRepository.save(new Post(p.getId(),
                p.getTitle(),
                p.getCreateDate(),
                p.getUser(),
                p.getCategory()));
    }


    public List<PostDto> findAll() {
        return listMapper(postRepository.findAll());
    }


    public static List<PostDto> listMapper(List<Post> list){
        return list.parallelStream()
                .map(p-> new PostDto(
                        p.getId(),
                        p.getTitle(),
                        p.getCreateDate(),
                        p.getUser(),
                        p.getCategory()))
                .collect(Collectors.toList());
    }


    public void delete(Long id) {
        postRepository.deleteById(id);
    }


    public Optional<Post> findById(Long id) {
        return postRepository.findById(id);
    }


}
