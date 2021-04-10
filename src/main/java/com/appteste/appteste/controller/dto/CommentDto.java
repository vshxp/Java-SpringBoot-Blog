package com.appteste.appteste.controller.dto;

import com.appteste.appteste.model.Post;
import com.appteste.appteste.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CommentDto {
    private Long id;
    private String comment;
    private Date createDate;
    private Post post;
    private User user;
    private Boolean visible;
}
