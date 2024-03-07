package com.am.skillmaker.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.am.skillmaker.model.base.BasedNanoIdEntity;
import lombok.Data;

@Data
@Entity(name = "$user")
@Table(name = "_USER")
public class User extends BasedNanoIdEntity {

    @Column(name = "LOGIN")
    private String login;

    @Column(name = "PASSWORD")
    private String password;
}
