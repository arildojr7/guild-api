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
                Event("Disney on Ice",
                        "https://cdn-images-1.medium.com/max/1000/1*yIoc1UmNsQ4kJu0VFVSJ-A.png",
                        "Descrição padrão",
                        1557772572,
                        "Fiergs", Pair(50.1,30.5),
                        "Porto Alegre/RS")
        )
        repository.save(
                Event("A Bela e a Fera",
                        "https://cdn-images-1.medium.com/max/1000/1*yIoc1UmNsQ4kJu0VFVSJ-A.png",
                        "Descrição bela",
                        1557772543,
                        "Uniãozinho", Pair(20.1,10.5),
                        "Alvorada/RS")
        )

    }

}

fun main(args: Array<String>) {
    runApplication<GuildApiApplication>(*args)
}