package com.example.LR_3.model;

public class Student extends Human {
    private Group group;
    private Department department;
    private Faculty faculty;
    private University university;

    public Student(String name, String surname, String fatherName, Sex sex) {
        super(name, surname, fatherName, sex);
    }

    public Student(String name, String surname, String fatherName, Sex sex, Group group, Department department, Faculty faculty, University university) {
        super(name, surname, fatherName, sex);
        this.group = group;
        this.department = department;
        this.faculty = faculty;
        this.university = university;
    }

    public Group getGroup() {
        return this.group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Department getDepartment() {
        return this.department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Faculty getFaculty() {
        return this.faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public University getUniversity() {
        return this.university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }
}
