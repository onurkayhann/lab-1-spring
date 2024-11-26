package com.onurkayhann.lab_1_spring.controller

import com.onurkayhann.lab_1_spring.model.BJJFighter
import com.onurkayhann.lab_1_spring.repository.BJJFighterRepository
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class BJJFighterController(
    private val bjjFighterRepository: BJJFighterRepository
) {

    @PostMapping("/fighter")
    fun addNewFighter(@RequestBody bjjFighter: BJJFighter): BJJFighter {

        return bjjFighterRepository.save(bjjFighter)

    }

}