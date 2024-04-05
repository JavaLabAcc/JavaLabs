package com.example.LR_3.model;

public class University extends BaseStructure {
    private Faculty[] faculties;

    public University(String name, Human headmaster) {
        super(name, headmaster);
    }

    public University(String name, Human headmaster, Faculty[] faculties) {
        super(name, headmaster);
        this.faculties = faculties;
    }

    public Faculty[] getFaculties() {
        return this.faculties;
    }

    public void setFaculty(Faculty[] faculties) {
        this.faculties = faculties;
    }
}
