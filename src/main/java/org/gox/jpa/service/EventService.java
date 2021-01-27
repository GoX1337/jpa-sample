package org.gox.jpa.service;

import org.gox.jpa.entity.Event;
import org.gox.jpa.form.EventForm;
import org.gox.jpa.repository.EventJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    @Autowired
    private EventJpaRepository eventRepository;

    public List<Event> findAll(){
        return eventRepository.findAll();
    }

    public Optional<Event> find(long id){
        return eventRepository.findById(id);
    }

    public void create(EventForm event){
        eventRepository.save(new Event(event.getDate(), event.getPayload()));
    }

    public void delete(Long id) {
        eventRepository.deleteById(id);
    }
}
