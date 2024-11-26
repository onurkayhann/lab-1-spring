package com.onurkayhann.lab_1_spring.model

import jakarta.persistence.*

@Entity
@Table(name = "fighters")
class BJJFighter(
    var name: String = "",
    var age: Int = 0,
    var degree: String = "",
    var club: String = "",
    var isCompeting: Boolean = true,

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null
) {
}