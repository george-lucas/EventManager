package com.EventManager.infrastructure.persistence.entity;

import com.EventManager.domain.model.Event;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_event")
public class EventEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private LocalDateTime dateTime;
    private String localization;

    public EventEntity() {
    }

    public static EventEntity fromDomain(Event event) {
        EventEntity entity = new EventEntity();
        entity.id = event.getId();
        entity.name = event.getName();
        entity.description = event.getDescription();
        entity.dateTime = event.getDateTime();
        entity.localization = event.getLocalization();

        return entity;
    }

    public Event toDomain() {
        return new Event(
            this.id,
            this.name,
            this.description,
            this.dateTime,
            this.localization
        );
    }
}