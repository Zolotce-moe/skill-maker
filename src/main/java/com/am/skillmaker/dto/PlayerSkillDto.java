package com.am.skillmaker.dto;

import com.am.skillmaker.model.Skill;
import com.am.skillmaker.model.UserProfile;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlayerSkillDto {
    private String id;
    private UserProfile userProfile;
    private Skill skill;
    private String explanations;
    private Byte rating;
}
