package com.appteste.appteste.repository;

import com.appteste.appteste.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
