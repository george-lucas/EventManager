package com.EventManager.interfaces.controllers;

import com.EventManager.domain.model.Event;
import com.EventManager.domain.service.EventService;
import com.EventManager.interfaces.dto.EventRequestDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/home")
    public String home(){
        return "Home";
    }

    @PostMapping("/save")
    public Event save(@RequestBody EventRequestDTO dto){
        return eventService.saveEvent(dto);
    }


}
