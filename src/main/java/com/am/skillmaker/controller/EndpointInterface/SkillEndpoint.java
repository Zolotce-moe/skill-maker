package com.am.skillmaker.controller.EndpointInterface;

import com.am.skillmaker.dto.SkillDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface SkillEndpoint {
    @PostMapping(value = "/")
    SkillDto createSkill(@RequestBody SkillDto skillDto);

    @GetMapping(value = "/{skillId}")
    SkillDto getSkill(@PathVariable String skillId);

    @PutMapping(value = "/{skillId}")
    SkillDto updateSkill(@PathVariable String skillId, @RequestBody SkillDto skillDto);

    @DeleteMapping(value = "/{skillId}")
    void deleteSkill(@PathVariable String skillId);

    @GetMapping(value = "/all")
    List<SkillDto> getAllSkills();
}
