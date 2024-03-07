package com.am.skillmaker.controller.EndpointInterface;

import com.am.skillmaker.dto.MessageDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface MessageEndpoint {
    @PostMapping(value = "/")
    MessageDto createMessage(@RequestBody MessageDto messageDto);

    @GetMapping(value = "/{messageId}")
    MessageDto getMessage(@PathVariable String messageId);

    @PutMapping(value = "/{messageId}")
    MessageDto updateMessage(@PathVariable String messageId, @RequestBody MessageDto messageDto);

    @DeleteMapping(value = "/{messageId}")
    void deleteMessage(@PathVariable String messageId);

    @GetMapping(value = "/history/{fromUserProfileId}/{forUserProfileId}")
    List<MessageDto> getHistory(@PathVariable String fromUserProfileId,
                                       @PathVariable String forUserProfileId);
}
