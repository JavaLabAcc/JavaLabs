package com.example.LR_4.controller;

import com.example.LR_4.model.Student;
import com.example.LR_4.model.Group;
import com.example.LR_4.model.Sex;

public abstract class GroupCreator {
    public static Group create(String groupName, String headmasterName, String headmasterSurname, String headmasterFatherName, Sex headmasterSex) {
        return new Group(
            groupName,
            HumanCreator.create(
                headmasterName,
                headmasterSurname,
                headmasterFatherName,
                headmasterSex
            )
        );
    }

    public static Group create(String groupName, String headmasterName, String headmasterSurname, String headmasterFatherName, Sex headmasterSex, Student[] students) {
        return new Group(
            groupName,
            HumanCreator.create(
                headmasterName,
                headmasterSurname,
                headmasterFatherName,
                headmasterSex
            ),
            students
        );
    }
}
