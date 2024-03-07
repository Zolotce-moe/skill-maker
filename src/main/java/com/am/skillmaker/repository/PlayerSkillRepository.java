package com.am.skillmaker.repository;

import com.am.skillmaker.model.PlayerSkill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerSkillRepository extends JpaRepository<PlayerSkill, String> {
}
