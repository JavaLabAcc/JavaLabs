package com.example.LR_3.model;

public abstract class BaseStructure {
    private String name;
    private Human headmaster;

    public BaseStructure(String name, Human headmaster) {
        this.name = name;
        this.headmaster = headmaster;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getHeadmaster() {
        return this.headmaster;
    }

    public void setHeadmaster(Human headmaster) {
        this.headmaster = headmaster;
    }
}
