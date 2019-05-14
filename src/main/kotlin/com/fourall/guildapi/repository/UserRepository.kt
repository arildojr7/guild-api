package com.fourall.guildapi.repository

import com.fourall.guildapi.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {
    fun findByName(name: String) : User
}