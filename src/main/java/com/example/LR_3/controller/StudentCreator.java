package com.example.LR_3.controller;

import com.example.LR_3.model.Student;
import com.example.LR_3.model.Group;
import com.example.LR_3.model.University;
import com.example.LR_3.model.Department;
import com.example.LR_3.model.Faculty;
import com.example.LR_3.model.Sex;

public abstract class StudentCreator {
    public static Student create(String name, String surname, String fatherName, Sex sex) {
        return new Student(
            name,
            surname,
            fatherName,
            sex
        );
    }

    public static Student create(String name, String surname, String fatherName, Sex sex, Group group, Department department, Faculty faculty, University university) {
        return new Student(
            name,
            surname,
            fatherName,
            sex,
            group,
            department,
            faculty,
            university
        );
    }
}
