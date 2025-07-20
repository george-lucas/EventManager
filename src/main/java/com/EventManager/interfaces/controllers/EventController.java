package com.EventManager.interfaces.controllers;

import com.EventManager.domain.model.Event;
import com.EventManager.domain.useCases.CreateEventUseCase;
import com.EventManager.interfaces.dto.EventRequestDTO;
import com.EventManager.interfaces.mapper.EventMapper;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/event")
public class EventController {

    private final CreateEventUseCase createEventUseCase;

    public EventController(CreateEventUseCase createEventUseCase) {
        this.createEventUseCase = createEventUseCase;
    }

    @GetMapping("/home")
    public String home(){
        return "Home";
    }

    @PostMapping("/save")
    public EventRequestDTO save(@RequestBody EventRequestDTO dto){
        Event event = EventMapper.toDomain(dto);
        Event eventSaved = createEventUseCase.execute(event);
        return EventMapper.toResponse(eventSaved);

    }


}
