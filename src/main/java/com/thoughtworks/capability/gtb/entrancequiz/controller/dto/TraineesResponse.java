package com.thoughtworks.capability.gtb.entrancequiz.controller.dto;

import com.thoughtworks.capability.gtb.entrancequiz.model.Trainee;

import java.util.List;
import java.util.stream.Collectors;

public class TraineesResponse {
    private final List<TraineeResponse> trainees;

    public TraineesResponse(List<Trainee> trainees) {
        this.trainees = trainees.stream()
                .map(TraineeResponse::new)
                .collect(Collectors.toList());
    }

    public List<TraineeResponse> getTrainees() {
        return trainees;
    }
}
