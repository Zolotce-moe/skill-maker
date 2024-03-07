package com.am.skillmaker.repository;

import com.am.skillmaker.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, String> {
}
