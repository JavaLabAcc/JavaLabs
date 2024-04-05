package com.example.LR_3.model;



public class Human {
    private String name, surname, fatherName;
    private Sex sex;

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
}
