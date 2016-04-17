package com.example.leo.tpassignment6.factories.person;

import com.example.leo.tpassignment6.domain.person.Person;

/**
 * Created by Leo on 4/18/2016.
 */
public class PersonFactory {
    public static Person getPerson(String email ,String password) {
        return new Person.Builder()
                .email(email)
                .auvalue(password)
                .build();
    }
}
