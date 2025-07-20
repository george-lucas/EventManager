package com.EventManager.interfaces.dto;

import com.EventManager.domain.model.Event;

import java.time.LocalDateTime;

public class EventRequestDTO {

    private String name;
    private String description;
    private LocalDateTime dateTime;
    private String localization;

    public EventRequestDTO() {}

    public EventRequestDTO(String name, String description, LocalDateTime dateTime, String localization) {
        this.name = name;
        this.description = description;
        this.dateTime = dateTime;
        this.localization = localization;
    }

    // Getters e setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getLocalization() {
        return localization;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
    }

    public Event toDomain() {
        return new Event(null, name, description, dateTime, localization);
    }
}
