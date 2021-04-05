package com.sanderverbruggen.kotlinblogexamples.kotlin

import java.time.LocalDate
import java.time.Period
import java.util.*

/**
 * The Person class written in Kotlin
 */
class Person @JvmOverloads constructor(
        var name: String,
        var birthDate: LocalDate,
        val userID: String = UUID.randomUUID().toString()
) {
    @JvmOverloads
    fun age(refDate: LocalDate = LocalDate.now()) =
            Period.between(birthDate, refDate).years
}
