package com.example.LR_4.model;

import java.util.Arrays;
import java.util.Objects;

public class Department extends BaseStructure{
    private Group[] groups = new Group[1];

    public Department(String name, Human headmaster) {
        super(name, headmaster);
    }

    public Department(String name, Human headmaster, Group[] groups) {
        super(name, headmaster);
        this.groups = groups;
    }

    public Group[] getGroups() {
        return this.groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, headmaster, Arrays.hashCode(groups));
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Department)) return false;
        Department department = (Department) object;
        return Objects.equals(name, department.name) &&
                Objects.equals(headmaster, department.headmaster) &&
                Arrays.equals(groups, department.groups);
    }
}
