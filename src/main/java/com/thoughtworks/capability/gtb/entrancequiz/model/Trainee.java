package com.thoughtworks.capability.gtb.entrancequiz.model;

import java.util.Objects;

public class Trainee {
    private Integer id;
    private String Name;

    public Trainee(Integer id, String name) {
        this.id = id;
        Name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trainee trainee = (Trainee) o;
        return Objects.equals(id, trainee.id) &&
                Objects.equals(Name, trainee.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Name);
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }
}
