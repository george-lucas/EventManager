package com.EventManager.domain.service;

import com.EventManager.domain.model.Event;
import com.EventManager.infrastructure.repository.EventRepositoryImpl;
import com.EventManager.interfaces.dto.EventRequestDTO;

import java.util.List;

public class EventService {

    private final EventRepositoryImpl eventRepositoryImpl;

    public EventService(EventRepositoryImpl eventRepositoryImpl) {
        this.eventRepositoryImpl = eventRepositoryImpl;
    }

    public Event saveEvent(EventRequestDTO dto){
        Event event = dto.toDomain();
        return eventRepositoryImpl.save(event);
    }

}
