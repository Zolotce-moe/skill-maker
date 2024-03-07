package com.am.skillmaker.controller;

import com.am.skillmaker.controller.EndpointInterface.PlayerSkillEndpoint;
import com.am.skillmaker.dto.PlayerSkillDto;
import com.am.skillmaker.service.PlayerSkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/player_skill")
public class PlayerSkillController implements PlayerSkillEndpoint {
    private final PlayerSkillService playerSkillService;

    @Override
    public PlayerSkillDto createPlayerSkill(PlayerSkillDto playerSkillDto) {
        return playerSkillService.createPlayerSkill(playerSkillDto);
    }

    @Override
    public PlayerSkillDto getPlayerSkill(String playerSkillId) {
        return playerSkillService.getPlayerSkill(playerSkillId);
    }

    @Override
    public PlayerSkillDto updatePlayerSkill(String playerSkillId, PlayerSkillDto playerSkillDto) {
        return playerSkillService.updatePlayerSkill(playerSkillId, playerSkillDto);
    }

    @Override
    public void deletePlayerSkill(String playerSkillId) {
        playerSkillService.deletePlayerSkill(playerSkillId);
    }

    @Override
    public List<PlayerSkillDto> getAllSkills() {
        return playerSkillService.getAllSkills();
    }

    @Override
    public List<PlayerSkillDto> getAllAchievements(String userProfileId) {
        return playerSkillService.getAllAchievements(userProfileId);
    }

    @Override
    public List<PlayerSkillDto> getAllDefects(String userProfileId) {
        return playerSkillService.getAllDefects(userProfileId);
    }
}
