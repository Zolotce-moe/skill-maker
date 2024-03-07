package com.am.skillmaker.model;

import com.am.skillmaker.model.base.BasedNanoIdEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity(name = "$player_skill")
@Table(name = "PLAYER_SKILL")
public class PlayerSkill extends BasedNanoIdEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @JoinColumn(name = "USERPROFILE_ID")
    private UserProfile userProfile;

    @ManyToOne(fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @JoinColumn(name = "SKILL_ID")
    private Skill skill;

    @Column(name = "EXPLANATIONS")
    private String explanations;

    @Column(name = "RATING")
    private Byte rating;
}
