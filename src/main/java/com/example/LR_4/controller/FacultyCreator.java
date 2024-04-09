package com.example.LR_4.controller;

import com.example.LR_4.model.Department;
import com.example.LR_4.model.Faculty;
import com.example.LR_4.model.Sex;

public abstract class FacultyCreator {
    public static Faculty create(String facultyName, String headmasterName, String headmasterSurname, String headmasterFatherName, Sex headmasterSex) {
        return new Faculty(
            facultyName,
            HumanCreator.create(
                headmasterName,
                headmasterSurname,
                headmasterSurname,
                headmasterSex
            )
        );
    }

    public static Faculty create(String facultyName, String headmasterName, String headmasterSurname, String headmasterFatherName, Sex headmasterSex, Department[] departments) {
        return new Faculty(
            facultyName,
            HumanCreator.create(
                headmasterName,
                headmasterSurname,
                headmasterSurname,
                headmasterSex
            ),
            departments
        );
    }
}
