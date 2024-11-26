package com.onurkayhann.lab_1_spring.controller

import com.onurkayhann.lab_1_spring.model.BJJFighter
import com.onurkayhann.lab_1_spring.repository.BJJFighterRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/fighters")
class BJJFighterController(
    private val bjjFighterRepository: BJJFighterRepository
) {

    @PostMapping
    fun addNewFighter(@RequestBody bjjFighter: BJJFighter): ResponseEntity<String> {

        bjjFighterRepository.save(bjjFighter)

        return ResponseEntity.status(201).body("Fighter added!")

    }

}