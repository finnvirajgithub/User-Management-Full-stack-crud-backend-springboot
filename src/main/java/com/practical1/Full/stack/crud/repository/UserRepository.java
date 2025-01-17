package com.practical1.Full.stack.crud.repository;

import com.practical1.Full.stack.crud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
