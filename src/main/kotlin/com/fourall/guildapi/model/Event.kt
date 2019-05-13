package com.fourall.guildapi.model

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table
import javax.persistence.GeneratedValue

@Entity
@Table
data class Event(
        val name: String = "",
        val photo: String = "",
        val description: String = "",
        val date: Long = 0L,
        val local_name: String = "",
        val coordinates: Pair<Double,Double> = Pair(0.0,0.0),
        val city: String = "",
        @Id
        @GeneratedValue
        val id: Int = 0
)