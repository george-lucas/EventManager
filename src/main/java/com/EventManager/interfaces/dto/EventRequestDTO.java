package com.EventManager.interfaces.dto;

import com.EventManager.domain.enums.EventType;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class EventRequestDTO {
    private Long id;
    private String name;
    private String description;
    private LocalDateTime dateTime;
    private String localization;
    private String identifier;
    private EventType eventType;

    public EventRequestDTO(Long id, String name, String description, LocalDateTime dateTime, String localization, String identifier, EventType eventType) {
    }
}