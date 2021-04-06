package com.appteste.appteste.Repository;

import com.appteste.appteste.Model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
