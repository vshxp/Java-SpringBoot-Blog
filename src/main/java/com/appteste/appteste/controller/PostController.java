package com.appteste.appteste.controller;

import com.appteste.appteste.controller.dto.PostDto;
import com.appteste.appteste.model.Post;
import com.appteste.appteste.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/post")
public class PostController {

    @Autowired
    private PostService postService;

    @PutMapping("/new")
    @ResponseStatus(HttpStatus.OK)
    public void newPost(@RequestBody PostDto p){
        postService.save(p);
    }

    @PostMapping("/edit")
    @ResponseStatus(HttpStatus.OK)
    public void editPost(@RequestBody PostDto p){
        postService.save(p);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Optional<Post>> showPost(@PathVariable Long id){
        return ResponseEntity.ok(postService.findById(id));
    }

    @GetMapping("/")
    public ResponseEntity<List<PostDto>> listPost() {
        return ResponseEntity.ok(postService.findAll());
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deletePost(@PathVariable Long id){
        postService.delete(id);
    }


}
