package com.appteste.appteste.Repository;

import com.appteste.appteste.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
