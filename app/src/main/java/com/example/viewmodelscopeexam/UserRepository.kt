package com.example.viewmodelscopeexam

import kotlinx.coroutines.delay

class UserRepository {

    suspend fun getUsers() : List<User>{
        delay(5000)
        val users : List<User> = listOf(
            User(1,"lee"),
            User(2,"kim"),
            User(3,"park")
        )
        return users
    }


}