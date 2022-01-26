package com.example.finalquiz

data class Questions(
    val id: Int,
    val image: String,
    val question: String,
    val one: String,
    val two: String,
    val three: String,
    val four: String,
    val correctAnswer: Int,
)