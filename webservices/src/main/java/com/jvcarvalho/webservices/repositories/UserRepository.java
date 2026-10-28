package com.jvcarvalho.webservices.repositories;

import com.jvcarvalho.webservices.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
