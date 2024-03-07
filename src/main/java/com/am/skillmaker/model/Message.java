package com.am.skillmaker.model;

import com.am.skillmaker.model.base.BasedNanoIdEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity(name = "$message")
@Table(name = "MESSAGE")
public class Message extends BasedNanoIdEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @JoinColumn(name = "FROM_USERPROFILE_ID")
    private UserProfile fromUserProfile;

    @ManyToOne(fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @Column(name = "FOR_USERPROFILE_ID")
    private UserProfile forUserProfile;

    @Column(name = "TEXT")
    private String text;

    @Column(name = "DATE_TIME")
    private LocalDateTime dateTime;
}
