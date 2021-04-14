package com.appteste.appteste.controller;

import com.appteste.appteste.controller.dto.CommentDto;
import com.appteste.appteste.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PutMapping("/new")
    @ResponseStatus(HttpStatus.OK)
    public void newComment(@RequestBody CommentDto commentDto){
        commentService.save(commentDto);
    }

    @PostMapping("/edit")
    @ResponseStatus(HttpStatus.OK)
    public void editComment(@RequestBody CommentDto commentDto){
        commentService.save(commentDto);
    }

    @PostMapping("/delete")
    @ResponseStatus(HttpStatus.OK)
    public void deleteComment(@RequestBody CommentDto commentDto){
        commentService.logicDelete(commentDto);
    }

    @GetMapping("/list/{postid}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<CommentDto>> listCommentsByPost(@PathVariable Long postid){
        return ResponseEntity.ok(commentService.findCommentByPost(postid));
    }
}
