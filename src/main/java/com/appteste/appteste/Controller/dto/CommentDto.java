package com.appteste.appteste.Controller.dto;

import com.appteste.appteste.Model.Post;
import com.appteste.appteste.Model.User;
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
}
