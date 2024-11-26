package com.onurkayhann.lab_1_spring.repository

import com.onurkayhann.lab_1_spring.model.BJJFighter
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BJJFighterRepository: JpaRepository<BJJFighter, Long> {
}