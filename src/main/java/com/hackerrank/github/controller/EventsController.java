package com.hackerrank.github.controller;

import com.hackerrank.github.model.Event;
import com.hackerrank.github.repository.EventRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value = "/events")
public class EventsController {
    final EventRepository eventRepository;

    public EventsController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @GetMapping()
    public ResponseEntity<Event> getEventById() {
        // TODO: Return an event filtered by ID: Return event JSON with the given ID in response to a GET request
        //  at /events/{id}.
        //  If the event with the given ID does not exist, the response code should be 404.
        //  Otherwise, the response code should be 200.
        return ResponseEntity.ok().body(new Event());
    }

    @GetMapping()
    public ResponseEntity<List<Event>> getEventsByRepoId() {
        // TODO: Return the event records filtered by the repository ID: Return a JSON array of all events which
        //  are associated with the repository ID in response to a GET request at /events/repos/{repoID}.
        //  If the requested repository does not exist, the HTTP response code should be 404.
        //  Otherwise, the response code should be 200.
        //  The JSON array should be sorted in ascending order by event ID.
        return ResponseEntity.ok().body(Collections.emptyList());
    }

    @GetMapping()
    public ResponseEntity<List<Event>> getEventsByActorId() {
        // TODO: Return the event records filtered by the actor ID: Return a JSON array of all events which are
        //  performed by the actor ID in response to a GET request at /events/actors/{actorID}.
        //  If the requested actor does not exist, the HTTP response code should be 404.
        //  Otherwise, the response code should be 200.
        //  The JSON array should be sorted in ascending order by event ID.
        return ResponseEntity.ok().body(Collections.emptyList());
    }

    @GetMapping()
    public ResponseEntity<List<Event>> getEventsByRepoIdAndActorId() {
        // TODO: Return the event records filtered by the repository ID and the actor ID: Return the JSON array of
        //  all events associated with the repository ID and performed by the actor ID in response to a GET request
        //  at /events/repos/{repoID}/actors/{actorID}.
        //  If the requested repository or actor does not exist, the HTTP response code should be 404.
        //  Otherwise, the response code should be 200.
        //  The JSON array should be sorted in ascending order by event ID.
        return ResponseEntity.ok().body(Collections.emptyList());
    }

    @GetMapping()
    public ResponseEntity<List<Event>> getAllEvents() {
        // TODO: Return all events: Return a JSON array of all events in response to a GET request at /events.
        //  The HTTP response code should be 200.
        //  The JSON array should be sorted in ascending order by event ID.
        return ResponseEntity.ok().body(Collections.emptyList());
    }

    @PostMapping()
    public ResponseEntity<Event> createEvent() {
        // TODO: Create an event record in response to a POST request at /events.
        //  The event JSON is sent in the request body.
        //  If an event with the same id already exists then the HTTP response code should be 400,
        //  otherwise, the response code should be 201.
        return ResponseEntity.ok().body(new Event());
    }

    @DeleteMapping()
    public ResponseEntity<Void> deleteAllEvents() {
        // TODO: Erase all records: Erase all event records including actor and repository records in response to
        //  a DELETE request at /events. The HTTP response code should be 200.
        return ResponseEntity.ok().build();
    }
}
