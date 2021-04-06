package com.appteste.appteste.Service;

import com.appteste.appteste.Controller.dto.CommentDto;
import com.appteste.appteste.Model.Comment;
import com.appteste.appteste.Repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public void save(CommentDto commentDto) {
        commentRepository.save(new Comment(commentDto.getId(),
                commentDto.getComment(),
                commentDto.getCreateDate(),
                commentDto.getPost(),
                commentDto.getUser()));
    }

}
