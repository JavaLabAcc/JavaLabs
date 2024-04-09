package com.example.LR_4.model;

import java.util.Arrays;
import java.util.Objects;

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

    @Override
    public int hashCode() {
        return Objects.hash(name, headmaster, Arrays.hashCode(departments));
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Faculty)) return false;
        Faculty faculty = (Faculty) object;
        return Objects.equals(name, faculty.name) &&
                Objects.equals(headmaster, faculty.headmaster) &&
                Arrays.equals(departments, faculty.departments);
    }
}
