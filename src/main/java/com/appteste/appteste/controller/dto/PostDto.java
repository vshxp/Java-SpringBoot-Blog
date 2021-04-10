package com.appteste.appteste.controller.dto;

import com.appteste.appteste.model.Category;
import com.appteste.appteste.model.User;
import lombok.*;

import java.util.Date;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {
    private Long id;
    private String title;
    private Date createDate;
    private User user;
    private List<Category> category;
}
