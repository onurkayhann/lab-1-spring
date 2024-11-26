package com.onurkayhann.lab_1_spring.controller

import com.onurkayhann.lab_1_spring.model.BJJFighter
import com.onurkayhann.lab_1_spring.repository.BJJFighterRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/fighters")
class BJJFighterController(
    private val bjjFighterRepository: BJJFighterRepository
) {

    @GetMapping("/all")
    fun getAllFighters(): ResponseEntity<List<BJJFighter>> {
        val allFighters = bjjFighterRepository.findAll()

        return ResponseEntity.status(200).body(allFighters)
    }

    @GetMapping
    fun getFighterById(@RequestParam("id") id: Long): ResponseEntity<BJJFighter> {
        val foundOptionalFighter = bjjFighterRepository.findById(id)

        if (foundOptionalFighter.isPresent) {
            val notOptionalFighter = foundOptionalFighter.get()

            return ResponseEntity.status(200).body(notOptionalFighter)
        }

        return ResponseEntity.notFound().build()
    }

    @PostMapping
    fun addNewFighter(@RequestBody bjjFighter: BJJFighter): ResponseEntity<String> {

        bjjFighterRepository.save(bjjFighter)

        return ResponseEntity.status(201).body("Fighter added!")

    }

    @DeleteMapping
    fun deleteFighterById(@RequestParam("id") id: Long): ResponseEntity<String> {
        val fighter = bjjFighterRepository.deleteById(id)

        return ResponseEntity.status(204).body("Fighter successfully deleted!")
    }

}