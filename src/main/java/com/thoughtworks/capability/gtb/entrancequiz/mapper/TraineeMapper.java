package com.thoughtworks.capability.gtb.entrancequiz.mapper;

import com.thoughtworks.capability.gtb.entrancequiz.model.Trainee;

import java.util.ArrayList;
import java.util.List;

public class TraineeMapper {
    public static List<Trainee> trainees = new ArrayList<Trainee>();
    static {

        trainees.add(new Trainee(1, "成吉思汗"));
        trainees.add(new Trainee(2, "鲁班七号"));
        trainees.add(new Trainee(3, "太乙真人"));
        trainees.add(new Trainee(4, "钟无艳"));
        trainees.add(new Trainee(5, "花木兰"));
        trainees.add(new Trainee(6, "雅典娜"));
        trainees.add(new Trainee(7, "芈月"));
        trainees.add(new Trainee(8, "白起"));
        trainees.add(new Trainee(9, "刘禅"));
        trainees.add(new Trainee(10, "庄周"));
        trainees.add(new Trainee(11, "马超"));
        trainees.add(new Trainee(12, "刘备"));
        trainees.add(new Trainee(13, "哪吒"));
        trainees.add(new Trainee(14, "大乔"));
        trainees.add(new Trainee(15, "蔡文姬"));
    }

    public List<Trainee> findAll(){
        return new ArrayList<>(TraineeMapper.trainees);
    }

    public void insert(Trainee trainee){
        TraineeMapper.trainees.add(trainee);
    }

}
