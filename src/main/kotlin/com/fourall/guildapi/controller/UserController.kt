package com.fourall.guildapi.controller

import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RequestMapping

@RestController
class UserController{

    @RequestMapping("/users")
    @ResponseBody
    fun getUsers(): String {
        return "{\"users\":[{\"name\":\"Lucas\", \"country\":\"Brazil\"}," + "{\"name\":\"Jackie\",\"country\":\"China\"}]}"
    }
}