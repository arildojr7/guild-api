package com.fourall.guildapi

import com.fourall.guildapi.model.Coordinates
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
        repository.deleteAll()

        repository.save(
            Event("Disney on Ice", "https://cdn-images-1.medium.com/max/1000/1*yIoc1UmNsQ4kJu0VFVSJ-A.png", "Descrição padrão", 1557772572, "Fiergs", "Porto Alegre/RS", Coordinates(30.059951, -51.171132))
        )
        repository.save(
            Event( "A Bela e a Fera", "https://cdn-images-1.medium.com/max/1000/1*yIoc1UmNsQ4kJu0VFVSJ-A.png", "Descrição bela", 1557772543, "Uniãozinho", "Alvorada/RS", Coordinates(-30.0273446,-51.1848655))
        )

    }

}

fun main(args: Array<String>) {
    runApplication<GuildApiApplication>(*args)
}