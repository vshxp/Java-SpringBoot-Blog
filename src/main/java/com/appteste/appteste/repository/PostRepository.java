package com.appteste.appteste.repository;

import com.appteste.appteste.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
