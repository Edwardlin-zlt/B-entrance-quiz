package com.thoughtworks.capability.gtb.entrancequiz.model;

import com.thoughtworks.capability.gtb.entrancequiz.model.builder.TraineeBuilder;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TraineeTest {

    @Test
    void testCreateTrainee() {
        TraineeBuilder traineeBuilder = new TraineeBuilder();
        traineeBuilder.withId(1);
        traineeBuilder.withName("testName");
        Trainee trainee = traineeBuilder.build();

        assertThat(trainee.getId(), is(1));
        assertThat(trainee.getName(), is("testName"));
    }
}
