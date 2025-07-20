package com.EventManager.domain.model;

import java.time.LocalDateTime;

public class Event {

    private Long id;
    private String name;
    private String description;
    private LocalDateTime dateTime;
    private String localization;

    public Event() {
    }

    public Event(String name, String description, LocalDateTime dateTime, String localization) {
        this.name = name;
        this.description = description;
        this.dateTime = dateTime;
        this.localization = localization;
    }

    public Event(Long id, String name, String description, LocalDateTime dateTime, String localization) {
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

}
