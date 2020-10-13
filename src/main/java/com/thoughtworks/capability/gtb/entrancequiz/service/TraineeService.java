package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.mapper.TraineeMapper;
import com.thoughtworks.capability.gtb.entrancequiz.model.Trainee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraineeService {
    private final TraineeMapper traineeMapper;

    public TraineeService(TraineeMapper traineeMapper) {
        this.traineeMapper = traineeMapper;
    }

    public List<Trainee> findAll(){
        return traineeMapper.findAll();
    }
}
