package com.example.LR_4.model;

import java.util.Objects;
import java.util.Arrays;

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

    @Override
    public int hashCode() {
        return Objects.hash(name, headmaster, Arrays.hashCode(students));
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Group)) return false;
        Group group = (Group) object;
        return Objects.equals(name, group.name) &&
                Objects.equals(headmaster, group.headmaster) &&
                Arrays.equals(students, group.students);
    }
}