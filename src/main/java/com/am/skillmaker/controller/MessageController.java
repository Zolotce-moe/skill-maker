package com.am.skillmaker.controller;

import com.am.skillmaker.controller.EndpointInterface.MessageEndpoint;
import com.am.skillmaker.dto.MessageDto;
import com.am.skillmaker.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/message")
public class MessageController implements MessageEndpoint {
    private final MessageService messageService;

    @Override
    public MessageDto createMessage(MessageDto messageDto) {
        return messageService.createMessage(messageDto);
    }

    @Override
    public MessageDto getMessage(String messageId) {
        return messageService.getMessage(messageId);
    }

    @Override
    public MessageDto updateMessage(String messageId, MessageDto messageDto) {
        return messageService.updateMessage(messageId, messageDto);
    }

    @Override
    public void deleteMessage(String messageId) {
        messageService.deleteMessage(messageId);
    }

    @Override
    public List<MessageDto> getHistory(String fromUserProfileId, String forUserProfileId) {
        return null;
    }
}
