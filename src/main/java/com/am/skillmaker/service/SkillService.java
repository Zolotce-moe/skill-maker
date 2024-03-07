package com.am.skillmaker.service;

import com.am.skillmaker.dto.SkillDto;
import com.am.skillmaker.repository.SkillRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class SkillService {
    private final SkillRepository skillRepository;

    public SkillDto createSkill(SkillDto skillDto) {
        return null;
    }


    public SkillDto getSkill(String skillId) {
        return null;
    }


    public SkillDto updateSkill(String skillId, SkillDto skillDto) {
        return null;
    }


    public void deleteSkill(String skillId) {
    }


    public List<SkillDto> getAllSkills() {
        return null;
    }

}
