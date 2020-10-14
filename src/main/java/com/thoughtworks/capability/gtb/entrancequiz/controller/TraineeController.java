package com.thoughtworks.capability.gtb.entrancequiz.controller;
//TODO GTB：删除无用import
import com.thoughtworks.capability.gtb.entrancequiz.controller.dto.TraineeResponse;
import com.thoughtworks.capability.gtb.entrancequiz.controller.dto.TraineesResponse;
import com.thoughtworks.capability.gtb.entrancequiz.model.Trainee;
import com.thoughtworks.capability.gtb.entrancequiz.service.TraineeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//TODO GTB：缺少添加学员接口、查找分组接口、自动分组的接口
@RestController
@RequestMapping("/trainees")
public class TraineeController {
    private final TraineeService traineeService;

    public TraineeController(TraineeService traineeService) {
        this.traineeService = traineeService;
    }

    @CrossOrigin()
    @GetMapping()
    public ResponseEntity<TraineesResponse> getAllContacts() {
        List<Trainee> trainees = traineeService.findAll();
        return ResponseEntity.ok(new TraineesResponse(trainees));
    }
}
