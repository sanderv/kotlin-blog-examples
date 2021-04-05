package com.sanderverbruggen.kotlinblogexamples.kotlin

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.time.LocalDate
import java.time.Month

class PersonTest {
    val person = Person("Sander", LocalDate.of(2000, Month.JANUARY, 1), "sander")

    @Test
    internal fun `test person age now`() {
        assertThat(person.age()).isGreaterThan(20)
    }

    @Test
    internal fun `test person age on reference date`() {
        assertThat(person.age(LocalDate.of(2003, Month.MARCH, 3))).isEqualTo(3)
    }
}
