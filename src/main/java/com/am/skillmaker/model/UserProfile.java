package com.am.skillmaker.model;

import com.am.skillmaker.model.base.BasedNanoIdEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity(name = "$user_profile")
@Table(name = "USERPROFILE")
public class UserProfile extends BasedNanoIdEntity {

    @OneToOne(fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @JoinColumn(name = "USER_ID")
    private User user;

//    @Column(name = "PHOTO")
//    private String photo;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "MIDDLE_NAME")
    private String middleName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "DATE_OF_BIRTH")
    private LocalDate dateOfBirth;

    @Column(name = "ABOUT_ME")
    private String aboutMe;

    @Column(name = "RATING")
    private Float rating;
}
