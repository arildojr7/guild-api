package com.fourall.guildapi

import com.fourall.guildapi.model.Event
import com.fourall.guildapi.repository.EventRepository
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean


@SpringBootApplication
class GuildApiApplication {

    @Bean
    fun init(repository: EventRepository) = CommandLineRunner {
        repository.save(
            Event(0,"Disney on Ice", "https://cdn-images-1.medium.com/max/1000/1*yIoc1UmNsQ4kJu0VFVSJ-A.png", "Descrição padrão", 1557772572, "Fiergs", "Porto Alegre/RS",40.3,23.0)
        )
        repository.save(
            Event(0, "A Bela e a Fera", "https://cdn-images-1.medium.com/max/1000/1*yIoc1UmNsQ4kJu0VFVSJ-A.png", "Descrição bela", 1557772543, "Uniãozinho", "Alvorada/RS", 43.4,55.7)
        )

    }

}

fun main(args: Array<String>) {
    runApplication<GuildApiApplication>(*args)
}