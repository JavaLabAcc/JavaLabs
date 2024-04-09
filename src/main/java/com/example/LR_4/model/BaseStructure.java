package com.example.LR_4.model;

public abstract class BaseStructure {
    protected String name;
    protected Human headmaster;

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

    // @Override
    // public String toString() {
    //     return String.format("");
    // }

    // @Override
    // public int hashCode() {
    //     return Objects.hash(name, headmaster);
    // }
}
