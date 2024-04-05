package com.example.LR_3;

import com.example.LR_3.controller.*;
import com.example.LR_3.model.*;

public class Run {
    public static void main(String[] args) {
        University university = createTypicalUniversity();
    }

    public static University createTypicalUniversity() {
        Student student_1 = StudentCreator.create("Oleksandr", "Boichenko", "Oleksandrovich", Sex.MAN);
        Student student_2 = StudentCreator.create("Katerina", "Seredniak", "Oleksandrivna", Sex.WOMAN);
        Student student_3 = StudentCreator.create("Yan", "Sheleg", "Pavlovich", Sex.MAN);

        Student[] students = {student_1, student_2, student_3};
        Group group = GroupCreator.create(
            "125-20-1",
            "Ilya",
            "Olishevskiy",
            "Genadiyovich",
            Sex.MAN,
            students
        );

        Group[] groups = {group};
        Department department = DepartmentCreator.create(
            "Department of Information Security and Telecommunications",
            "Valeriy",
            "Kornienko",
            "Ivanovich",
            Sex.MAN,
            groups
        );

        Department[] departments = {department};
        Faculty faculty = FacultyCreator.create(
            "Faculty of Information Technologic",
            "Irina",
            "Udovik",
            "Mihaylivna",
            Sex.WOMAN,
            departments
        );

        Faculty[] faculties = {faculty};
        University university = UniversityCreator.create(
            "National Technical University Dnipro Politechnical",
            "Oleksandr",
            "Azukovskii",
            "Oleksandrovich",
            Sex.MAN,
            faculties
        );

        return university;
    }
}
