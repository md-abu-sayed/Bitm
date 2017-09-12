package com.bitm.trainer.basiclistview;

/**
 * Created by Trainer on 8/22/2017.
 */

public class Trainee {
    private String traineeName;
    private String traineeId;

    public Trainee(String traineeName, String traineeId) {
        this.traineeName = traineeName;
        this.traineeId = traineeId;
    }

    public String getTraineeName() {
        return traineeName;
    }

    public String getTraineeId() {
        return traineeId;
    }
}
