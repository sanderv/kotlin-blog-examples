package com.sanderverbruggen.kotlinblogexamples.java;

import java.time.LocalDate;
import java.time.Period;

/**
 * The Person class, written in Java
 */
public class Person {
    private String name;
    private LocalDate birthDate;
    private final String userID;

    public Person(String name, LocalDate birthDate, String userID) {
        this.name = name;
        this.birthDate = birthDate;
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getUserID() {
        return userID;
    }

    public int age(LocalDate refDate) {
        if (birthDate != null && refDate != null) {
            return Period.between(birthDate, refDate).getYears();
        } else {
            return 0;
        }
    }

    public int age() {
        return age(LocalDate.now());
    }
}
