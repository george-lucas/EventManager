package com.EventManager.application.useCases;

import com.EventManager.domain.model.Event;
import com.EventManager.domain.repository.EventRepository;
import com.EventManager.domain.useCases.CreateEventUseCase;
import org.springframework.stereotype.Service;

@Service
public class CreateEventUseCaseImpl implements CreateEventUseCase {

    private final EventRepository eventRepository;

    public CreateEventUseCaseImpl(EventRepository eventRepository){
        this.eventRepository = eventRepository;
    }

    @Override
    public Event execute(Event event) {
        return eventRepository.save(event);
    }


//
//    public Event execute(EventRequestDTO dto){
//        Event event = dto.toDomain();
//        return null;//eventRepositoryImpl.execute(event);
//    }

}
