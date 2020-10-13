package com.thoughtworks.capability.gtb.entrancequiz.mapper;

import com.thoughtworks.capability.gtb.entrancequiz.model.Trainee;

import java.util.ArrayList;
import java.util.List;

public class TraineeMapper {
    public static List<Trainee> trainees = new ArrayList<Trainee>();

    public List<Trainee> findAll(){
        return new ArrayList<>(TraineeMapper.trainees);
    }

    public void insert(Trainee trainee){
        TraineeMapper.trainees.add(trainee);
    }

}
