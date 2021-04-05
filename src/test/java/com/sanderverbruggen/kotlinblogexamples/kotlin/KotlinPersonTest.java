package com.sanderverbruggen.kotlinblogexamples.kotlin;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Testing the Kotlin class Person in Java (interoperability)
 */
class KotlinPersonTest {
    private final Person kotlinPerson = new Person("Kotlin Person",
            LocalDate.of(2000, 1, 1),
            "kotlin");

    @Test
    void testBasicInteraction() {
        assertThat(kotlinPerson.getName()).isEqualTo("Kotlin Person");
        kotlinPerson.setName("Sander");
        assertThat(kotlinPerson.getName()).isEqualTo("Sander");

        assertThat(kotlinPerson.getUserID()).isEqualTo("kotlin");
        // kotlinPerson.setUserID(); // This will not compile, no setter present
    }

    @Test
    void testPersonAgeNow() {
        assertThat(kotlinPerson.age()).isGreaterThan(20);
    }

    @Test
    void testPersonAgeReferenceDate() {
        assertThat(kotlinPerson.age(LocalDate.of(2003, Month.MARCH, 3))).isEqualTo(3);
    }
}
