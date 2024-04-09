package com.example.LR_4.controller;

import com.example.LR_4.model.Human;
import com.example.LR_4.model.Sex;

public abstract class HumanCreator {
    public static Human create(String name, String surname, String fatherName, Sex sex) {
        return new Human(name, surname, fatherName, sex);
    }
}
