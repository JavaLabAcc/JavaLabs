package com.example.LR_3.model;

public class Group extends BaseStructure {
    private Student[] students = new Student[1];

    public Group(String name, Human headmaster) {
        super(name, headmaster);
    }

    public Group(String name, Human headmaster, Student[] students) {
        super(name, headmaster);
        this.students = students;
    }

    public Student[] getStudents() {
        return this.students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}