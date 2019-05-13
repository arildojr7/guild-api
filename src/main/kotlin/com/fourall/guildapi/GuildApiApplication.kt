package com.fourall.guildapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GuildApiApplication

fun main(args: Array<String>) {
    runApplication<GuildApiApplication>(*args)
}
