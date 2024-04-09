package com.example.LR_4.model;

import java.util.Objects;

public class Human {
    protected String name, surname, fatherName;
    protected Sex sex;

    public Human(String name, String surname, String fatherName, Sex sex) {
        this.name = name;
        this.surname = surname;
        this.fatherName = fatherName;
        this.sex = sex;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFatherName() {
        return this.fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public Sex getSex() {
        return this.sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, fatherName, sex);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Human)) return false;
        Human human = (Human) object;
        return Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname) &&
                Objects.equals(fatherName, human.fatherName) &&
                sex == human.sex;
    }
}
