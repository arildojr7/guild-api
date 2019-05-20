package com.fourall.guildapi.repository

import com.fourall.guildapi.model.Event
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface EventRepository : MongoRepository<Event, String> {
    fun findByName(name: String) : Event
}