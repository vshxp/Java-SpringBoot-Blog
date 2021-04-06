package com.appteste.appteste.Controller;

import com.appteste.appteste.Controller.dto.CommentDto;
import com.appteste.appteste.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

}
