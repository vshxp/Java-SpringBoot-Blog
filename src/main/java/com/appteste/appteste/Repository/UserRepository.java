package com.appteste.appteste.Repository;

import com.appteste.appteste.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
