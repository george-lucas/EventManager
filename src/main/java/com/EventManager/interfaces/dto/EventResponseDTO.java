package com.EventManager.interfaces.dto;

import com.EventManager.domain.model.Event;

import java.time.LocalDateTime;

public class EventResponseDTO {

    private Long id;
    private String name;
    private String description;
    private LocalDateTime dateTime;
    private String localization;

    public EventResponseDTO() {}

    public EventResponseDTO(Long id, String name, String description, LocalDateTime dateTime, String localization) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.dateTime = dateTime;
        this.localization = localization;
    }

    // Getters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public static EventResponseDTO fromDomain(Event event) {
        return new EventResponseDTO(
                event.getId(),
                event.getName(),
                event.getDescription(),
                event.getDateTime(),
                event.getLocalization()
        );
    }
}
