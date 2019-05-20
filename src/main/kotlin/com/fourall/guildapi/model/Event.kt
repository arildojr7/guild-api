package com.fourall.guildapi.model

import com.fasterxml.jackson.annotation.JsonIgnore
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "events")

data class Event(
        val name: String = "",
        val photo: String = "",
        val description: String = "",
        val date: Long = 0L,
        val local_name: String = "",
        val city: String = "",
        val coordinates: Coordinates = Coordinates(0.0, 0.0),
        @Id
        @JsonIgnore
        val id: String? = null
)