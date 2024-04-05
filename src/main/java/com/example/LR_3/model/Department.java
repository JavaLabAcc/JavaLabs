package com.example.LR_3.model;

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
}
