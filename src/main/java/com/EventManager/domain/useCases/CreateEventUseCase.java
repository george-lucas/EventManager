package com.EventManager.domain.useCases;

import com.EventManager.domain.model.Event;

public interface CreateEventUseCase {
    Event execute(Event event);

}
