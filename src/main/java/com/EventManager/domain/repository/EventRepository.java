package com.EventManager.domain.repository;

import com.EventManager.domain.model.Event;

import java.util.List;
import java.util.Optional;

public interface EventRepository {

    Event save(Event event);
    Optional<Event> getEventById(Long id);
    List<Event> getAll();
}
