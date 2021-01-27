package org.gox.jpa.controller;

import org.gox.jpa.entity.Event;
import org.gox.jpa.form.EventForm;
import org.gox.jpa.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping("/event")
    public Event get(@RequestParam Long id) {
        return eventService
                .find(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Event not found"));
    }

    @GetMapping("/events")
    public List<Event> getAll() {
        return eventService.findAll();
    }

    @PostMapping("/event")
    public ResponseEntity create(@RequestBody EventForm event) {
        eventService.create(event);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/event")
    public ResponseEntity delete(@RequestParam Long id) {
        eventService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
