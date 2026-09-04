package com.example.petshop

class Happy(date: String): Mood(date) {
    override fun explain(): String {
        return "The date is $date"
    }
}