package com.example.LR_4.model;

import java.util.Arrays;
import java.util.Objects;

public class University extends BaseStructure {
    private Faculty[] faculties;

    public University(String name, Human headmaster) {
        super(name, headmaster);
    }

    public University(String name, Human headmaster, Faculty[] faculties) {
        super(name, headmaster);
        this.faculties = faculties;
    }

    public Faculty[] getFaculties() {
        return this.faculties;
    }

    public void setFaculty(Faculty[] faculties) {
        this.faculties = faculties;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, headmaster, Arrays.hashCode(faculties));
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof University)) return false;
        University university = (University) object;
        return Objects.equals(name, university.name) &&
                Objects.equals(headmaster, university.headmaster) &&
                Arrays.equals(faculties, university.faculties);
    }
}
