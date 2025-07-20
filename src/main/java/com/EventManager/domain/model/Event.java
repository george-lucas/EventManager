package com.EventManager.domain.model;
import com.EventManager.domain.enums.EventType;

import java.time.LocalDateTime;

public class Event {

    private Long id;
    private String name;
    private String description;
    private LocalDateTime dateTime;
    private String localization;
    private String identifier;
    private EventType eventType;


    public Event(Long id, String name, String description, LocalDateTime dateTime, String localization, String identifier, EventType eventType) {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getLocalization() {
        return localization;
    }

    public String getIdentifier() {
        return identifier;
    }

    public EventType getEventType() {
        return eventType;
    }
}
