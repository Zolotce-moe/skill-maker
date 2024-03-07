package com.am.skillmaker.repository;

import com.am.skillmaker.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, String> {
}
