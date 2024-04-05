package com.example.LR_3.model;

public class Faculty extends BaseStructure {
    private Department[] departments;

    public Faculty(String name, Human headmaster) {
        super(name, headmaster);
    }

    public Faculty(String name, Human headmaster, Department[] departments) {
        super(name, headmaster);
        this.departments = departments;
    }

    public Department[] getDepartments() {
        return this.departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }
}
