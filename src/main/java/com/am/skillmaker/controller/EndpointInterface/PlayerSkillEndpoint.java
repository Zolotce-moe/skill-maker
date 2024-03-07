package com.am.skillmaker.controller.EndpointInterface;

import com.am.skillmaker.dto.PlayerSkillDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface PlayerSkillEndpoint {
    @PostMapping(value = "/")
    PlayerSkillDto createPlayerSkill(@RequestBody PlayerSkillDto playerSkillDto);

    @GetMapping(value = "/{playerSkillId}")
    PlayerSkillDto getPlayerSkill(@PathVariable String playerSkillId);

    @PutMapping(value = "/{playerSkillId}")
    PlayerSkillDto updatePlayerSkill(@PathVariable String playerSkillId, @RequestBody PlayerSkillDto playerSkillDto);

    @DeleteMapping(value = "/{playerSkillId}")
    void deletePlayerSkill(@PathVariable String playerSkillId);

    @GetMapping(value = "/all")
    List<PlayerSkillDto> getAllSkills();

    @GetMapping(value = "/all_achievements/{userProfileId}")
    List<PlayerSkillDto> getAllAchievements(@PathVariable String userProfileId);

    @GetMapping(value = "/all_defects/{userProfileId}")
    List<PlayerSkillDto> getAllDefects(@PathVariable String userProfileId);
}
