package com.thoughtworks.capability.gtb.entrancequiz.model.builder;

import com.thoughtworks.capability.gtb.entrancequiz.model.Trainee;

public class TraineeBuilder {
    private Integer id = null;
    private String name = "Test Name";

    public TraineeBuilder withName(String name){
        this.name = name;
        return this;
    }

    public TraineeBuilder withId(Integer id){
        this.id = id;
        return this;
    }

    public Trainee build() {
        return new Trainee(id, name);
    }
}
