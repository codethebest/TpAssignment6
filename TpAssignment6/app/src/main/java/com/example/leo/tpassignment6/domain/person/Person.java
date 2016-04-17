package com.example.leo.tpassignment6.domain.person;

import android.bluetooth.le.AdvertiseData;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Leo on 4/17/2016.
 */
public class Person implements Serializable {
    private String name;
    private String surname;
    private String email;
    private String auvalue;
    private String id;
    public Person() {

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuvalue ()
    {
        return auvalue;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public Person(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.email = builder.email;
        this.auvalue= builder.auvalue;
        this.id = builder.id;
    }

    public static class Builder {
        private String name;
        private String surname;
        private String email;
        private int age;
        private String auvalue;
        private String id;

        public Builder name(String value) {
            this.name = value;
            return this;
        }

        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder auvalue(String value)
        {
            this.auvalue = value;
            return this;
        }

        public Builder surname(String value) {
            this.surname = value;
            return this;
        }

        public Builder email(String value) {
            this.email = value;
            return this;
        }

        public Builder age(int value)
        {
            this.age = value;
            return this;

        }

        public Builder copy(Person value)
        {
            this.name = value.name;
            this.surname = value.surname;
            this.email = value.email;
            this.auvalue = value.auvalue;
            this.id=value.id;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return id != null ? id.equals(person.id) : person.id == null;

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}