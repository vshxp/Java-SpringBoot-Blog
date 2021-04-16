package com.appteste.appteste.service;

import com.appteste.appteste.controller.dto.CommentDto;
import com.appteste.appteste.model.Comment;
import com.appteste.appteste.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public void save(CommentDto commentDto) {
        commentRepository.save(new Comment(commentDto.getId(),
                        commentDto.getComment(),
                        commentDto.getCreateDate(),
                        commentDto.getVisible(),
                        commentDto.getPost(),
                        commentDto.getUser()));
    }

    public void logicDelete(CommentDto commentDto) {
        commentRepository.save(new Comment(commentDto.getId(),
                        commentDto.getComment(),
                        commentDto.getCreateDate(),
                        commentDto.getVisible(),
                        commentDto.getPost(),
                        commentDto.getUser()));
    }


    public List<CommentDto> findCommentByPost(Long postId) {
        return listMapper(commentRepository.findByPost(postId));
    }

    private List<CommentDto> listMapper(List<Comment> list){
        return list.parallelStream().map(c -> new CommentDto(c.getId(),
                        c.getComment(),
                        c.getCreateDate(),
                        c.getPost(),
                        c.getUser(),
                        c.getVisible())).collect(Collectors.toList());
    }



}
