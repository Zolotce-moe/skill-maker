package com.am.skillmaker.repository;

import com.am.skillmaker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
