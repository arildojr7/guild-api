package com.fourall.guildapi.model

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table
import javax.persistence.GeneratedValue

@Entity
@Table
data class Event(
        @Id
        @GeneratedValue
        val id: Long = 0,
        val name: String = "",
        val photo: String = "",
        val description: String = "",
        val date: Long = 0L,
        val local_name: String = "",
        val city: String = "",
        val latitude: Double = 0.0,
        val longitude: Double = 0.0
)