package com.am.skillmaker.model;

import com.am.skillmaker.model.base.BasedNanoIdEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity(name ="$skill")
@Table(name ="SKILL")
public class Skill extends BasedNanoIdEntity {
    @Column(name = "NAME")
    private String name;
}
