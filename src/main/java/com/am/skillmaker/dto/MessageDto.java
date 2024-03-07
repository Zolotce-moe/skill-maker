package com.am.skillmaker.dto;

import com.am.skillmaker.model.UserProfile;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MessageDto {
    private String id;
    private UserProfile fromUserProfile;
    private UserProfile forUserProfile;
    private String text;
    private LocalDateTime dateTime;
}
