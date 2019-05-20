package com.fourall.guildapi.repository

import com.fourall.guildapi.model.User
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository : MongoRepository<User, String> {
    fun findByName(name: String) : User
}