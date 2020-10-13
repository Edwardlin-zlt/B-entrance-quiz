package com.thoughtworks.capability.gtb.entrancequiz.controller.dto;

import com.thoughtworks.capability.gtb.entrancequiz.model.Trainee;

public class TraineeResponse {
    private Integer id;
    private String name;

    public TraineeResponse(Trainee trainee) {
        this.id = trainee.getId();
        this.name = trainee.getName();
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
}
