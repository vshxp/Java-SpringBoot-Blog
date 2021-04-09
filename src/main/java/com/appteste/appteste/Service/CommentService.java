package com.appteste.appteste.Service;

import com.appteste.appteste.Controller.dto.CommentDto;
import com.appteste.appteste.Model.Comment;
import com.appteste.appteste.Model.Post;
import com.appteste.appteste.Repository.CommentRepository;
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

    public List<CommentDto> findCommentByPostId(Long postId) {
        return listMapper(commentRepository.findAllByPostid());
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
