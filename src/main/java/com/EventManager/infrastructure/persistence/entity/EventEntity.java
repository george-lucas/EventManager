package com.EventManager.infrastructure.persistence.entity;

import com.EventManager.domain.enums.EventType;
import com.EventManager.domain.model.Event;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
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
    private String identifier;
    @Enumerated(EnumType.STRING)
    private EventType eventType;

    public static EventEntity fromDomain(Event event) {
        EventEntity entity = new EventEntity();
        entity.setId(event.getId());
        entity.setName(event.getName());
        entity.setDescription(event.getDescription());
        entity.setDateTime(event.getDateTime());
        entity.setLocalization(event.getLocalization());
        entity.setIdentifier(event.getIdentifier());
        entity.setEventType(event.getEventType());
        return entity;
    }

    public Event toDomain() {
        return new Event(
            this.id,
            this.name,
            this.description,
            this.dateTime,
            this.localization,
            this.identifier,
            this.eventType
        );
    }

}