package com.example.plugins

import io.ktor.application.*
import io.ktor.html.*
import io.ktor.response.*
import io.ktor.routing.*
import kotlinx.html.*

fun Application.configureRouting() {

    // Starting point for a Ktor app:
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        get("/html"){
            call.respondHtml {
                body{
                    h1{ +"HTML" }
                    ul {
                      for(n in 1..10)
                          li { +"$n"}
                    }
                }
            }
        }
    }
    routing {
    }
}
