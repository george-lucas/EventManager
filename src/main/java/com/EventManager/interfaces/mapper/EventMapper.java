package com.EventManager.interfaces.mapper;

import com.EventManager.domain.model.Event;
import com.EventManager.interfaces.dto.EventRequestDTO;

public class EventMapper {

    public static Event toDomain(EventRequestDTO dto) {
        return new Event(
            dto.getId(),
            dto.getName(),
            dto.getDescription(),
            dto.getDateTime(),
            dto.getLocalization(),
            dto.getIdentifier(),
            dto.getEventType()
        );
    }

    public static EventRequestDTO toResponse(Event event) {
        return new EventRequestDTO(
            event.getId(),
            event.getName(),
            event.getDescription(),
            event.getDateTime(),
            event.getLocalization(),
            event.getIdentifier(),
            event.getEventType()
        );
    }
}
