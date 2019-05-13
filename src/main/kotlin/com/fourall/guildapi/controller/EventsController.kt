package com.fourall.guildapi.controller

import com.fourall.guildapi.model.Event
import com.fourall.guildapi.repository.EventRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("events")
class EventsController {

    @Autowired
    lateinit var eventRepository: EventRepository

    @GetMapping
    fun getAllEvents(): List<Event> {
        return eventRepository.findAll()
    }

}