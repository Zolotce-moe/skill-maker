package com.am.skillmaker.service;

import com.am.skillmaker.dto.MessageDto;
import com.am.skillmaker.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class MessageService {
    private final MessageRepository messageRepository;

    public MessageDto createMessage(MessageDto messageDto) {
        return null;
    }

    public MessageDto getMessage(String messageId) {
        return null;
    }

    public MessageDto updateMessage(String messageId, MessageDto messageDto) {
        return null;
    }

    public void deleteMessage(String messageId) {
    }

    public List<MessageDto> getHistory(String fromUserProfileId,
                                       String forUserProfileId) {
        return null;
    }

}
