package com.thoughtworks.capability.gtb.entrancequiz.mapper;

import com.thoughtworks.capability.gtb.entrancequiz.model.Trainee;

import java.util.ArrayList;
import java.util.List;
//TODO GTB：一般来说，数据存储，插入相关功能，应该在repository包下
public class TraineeMapper {
    public static List<Trainee> trainees = new ArrayList<Trainee>();
    //TODO GTB：重复的代码，需要进行重构
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

    //TODO GTB：不要push不同task的未用到的代码
    public void insert(Trainee trainee){
        TraineeMapper.trainees.add(trainee);
    }

}
