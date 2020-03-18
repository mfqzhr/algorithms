package com.mfq.hash;

import java.util.Objects;

public class Person {
    private Integer age;
    private String name;
    private Float score;

    public Person(Integer age, String name, Float score) {
        this.age = age;
        this.name = name;
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age.equals(person.age) &&
                name.equals(person.name) &&
                score.equals(person.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, score);
    }
}
