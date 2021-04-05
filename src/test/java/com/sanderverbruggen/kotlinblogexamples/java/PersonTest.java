package com.sanderverbruggen.kotlinblogexamples.java;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Testing the Java class Person in Java
 */
class PersonTest {

    private final Person person = new Person("Sander", LocalDate.of(2000, Month.JANUARY, 1), "sander");

    @Test
    void testPersonAgeNow() {
        assertThat(person.age()).isGreaterThan(20);
    }

    @Test
    void testPersonAgeReferenceDate() {
        assertThat(person.age(LocalDate.of(2003, Month.MARCH, 3))).isEqualTo(3);
    }
}
