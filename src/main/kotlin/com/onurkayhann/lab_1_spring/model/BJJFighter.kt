package com.onurkayhann.lab_1_spring.model

import jakarta.persistence.*

@Entity
@Table(name = "fighters")
class BJJFighter(
    val name: String = "",
    val age: Int = 0,
    val degree: String = "",
    val club: String = "",
    val isCompeting: Boolean = true,

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null
) {
}