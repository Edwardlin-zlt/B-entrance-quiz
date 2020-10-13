package com.thoughtworks.capability.gtb.entrancequiz.model;

import java.util.Objects;

public class Trainee {
    private Integer id;
    private String name;

    public Trainee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Trainee(String name){
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trainee trainee = (Trainee) o;
        return Objects.equals(id, trainee.id) &&
                Objects.equals(name, trainee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "id=" + id +
                ", Name='" + name + '\'' +
                '}';
    }
}
