package org.gox.jpa.controller;

import org.gox.jpa.entity.Event;
import org.gox.jpa.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping("/")
    public List<Event> getAll() {
        return eventService.findAll();
    }

    @GetMapping("/:id")
    public Optional<Event> get() {
        return eventService.find(0);
    }

    @GetMapping("/insert")
    public String insert() {
        eventService.insertEvents();
        return "OK";
    }
}
