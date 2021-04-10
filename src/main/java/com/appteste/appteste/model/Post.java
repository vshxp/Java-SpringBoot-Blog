package com.appteste.appteste.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "createDate", nullable = false, updatable = false)
    @CreationTimestamp
    private Date createDate;

    @ManyToOne
    private User user;

    @ManyToMany
    private List<Category> category;

}
