package org.example.entity;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class User {
    private String name;
    private String surname;
    private int age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
