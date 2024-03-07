package com.am.skillmaker.controller;

import com.am.skillmaker.controller.EndpointInterface.SkillEndpoint;
import com.am.skillmaker.dto.SkillDto;
import com.am.skillmaker.service.SkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/skill")
public class SkillController implements SkillEndpoint {
    private final SkillService skillService;

    @Override
    public SkillDto createSkill(SkillDto skillDto) {
        return skillService.createSkill(skillDto);
    }

    @Override
    public SkillDto getSkill(String skillId) {
        return skillService.getSkill(skillId);
    }

    @Override
    public SkillDto updateSkill(String skillId, SkillDto skillDto) {
        return skillService.updateSkill(skillId, skillDto);
    }

    @Override
    public void deleteSkill(String skillId) {
        skillService.deleteSkill(skillId);
    }

    @Override
    public List<SkillDto> getAllSkills() {
        return skillService.getAllSkills();
    }
}
