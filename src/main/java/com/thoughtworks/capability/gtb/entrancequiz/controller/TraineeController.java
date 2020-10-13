package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.controller.dto.TraineeResponse;
import com.thoughtworks.capability.gtb.entrancequiz.controller.dto.TraineesResponse;
import com.thoughtworks.capability.gtb.entrancequiz.model.Trainee;
import com.thoughtworks.capability.gtb.entrancequiz.service.TraineeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trainees")
public class TraineeController {
    private final TraineeService traineeService;

    public TraineeController(TraineeService traineeService) {
        this.traineeService = traineeService;
    }

    @GetMapping()
    public ResponseEntity<TraineesResponse> getAllContacts() {
        List<Trainee> trainees = traineeService.findAll();
        return ResponseEntity.ok(new TraineesResponse(trainees));
    }
}
