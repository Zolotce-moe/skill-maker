package com.am.skillmaker.service;

import com.am.skillmaker.dto.PlayerSkillDto;
import com.am.skillmaker.repository.PlayerSkillRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class PlayerSkillService {
    private final PlayerSkillRepository playerSkillRepository;

    public PlayerSkillDto createPlayerSkill(PlayerSkillDto playerSkillDto) {
        return null;
    }

    public PlayerSkillDto getPlayerSkill(String playerSkillId) {
        return null;
    }

    public PlayerSkillDto updatePlayerSkill(String playerSkillId, PlayerSkillDto playerSkillDto) {
        return null;
    }

    public void deletePlayerSkill(String playerSkillId) {
    }

    public List<PlayerSkillDto> getAllSkills() {
        return null;
    }

    public List<PlayerSkillDto> getAllAchievements(String userProfileId) {
        return null;
    }

    public List<PlayerSkillDto> getAllDefects(String userProfileId) {
        return null;
    }

}
