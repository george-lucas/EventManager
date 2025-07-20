package com.EventManager.infrastructure.repository;

import com.EventManager.domain.model.Event;
import com.EventManager.domain.repository.EventRepository;
import com.EventManager.infrastructure.persistence.entity.EventEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EventRepositoryImpl implements EventRepository {

    private final EventRepositoryJPA eventRepositoryJPA;

    public EventRepositoryImpl(EventRepositoryJPA eventRepositoryJPA) {
        this.eventRepositoryJPA = eventRepositoryJPA;
    }

    @Override
    public Event save(Event event) {
        EventEntity entity = EventEntity.fromDomain(event);
        EventEntity savedEntity = this.eventRepositoryJPA.save(entity);
        return savedEntity.toDomain();
    }

    @Override
    public Optional<Event> getEventById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Event> getAll() {
        return List.of();
    }
}
