package com.hatch.demoapi;

import com.fasterxml.jackson.annotation.JsonTypeId;
public class Person {
    private long id;
    private final String name;
    private final int age;

    public Person(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) { this.id = id; }

    public String getName() {
        return this.name;
    }
}
