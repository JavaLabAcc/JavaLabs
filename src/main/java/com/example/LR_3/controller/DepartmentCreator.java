package com.example.LR_3.controller;

import com.example.LR_3.model.Department;
import com.example.LR_3.model.Group;
import com.example.LR_3.model.Sex;

public abstract class DepartmentCreator {
    public static Department create(String departmentName, String headmasterName, String headmasterSurname, String headmasterFatherName, Sex headmasterSex) {
        return new Department(
            departmentName,
            HumanCreator.create(
                headmasterName,
                headmasterSurname,
                headmasterFatherName,
                headmasterSex
            )
        );
    }

    public static Department create(String departmentName, String headmasterName, String headmasterSurname, String headmasterFatherName, Sex headmasterSex, Group[] groups) {
        return new Department(
            departmentName,
            HumanCreator.create(
                headmasterName,
                headmasterSurname,
                headmasterFatherName,
                headmasterSex
            ),
            groups
        );
    }
}
