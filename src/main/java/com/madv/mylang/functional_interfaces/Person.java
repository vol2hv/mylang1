package com.madv.mylang.functional_interfaces;

import lombok.Data;
import java.time.LocalDate;

@Data
public class Person {
    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;
    public static int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }}
