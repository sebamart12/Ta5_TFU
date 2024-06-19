package com.ucu.ada1.domain.score;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.experimental.FieldDefaults;

@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class TimeScore extends Score {

    String time;

    @Builder
    TimeScore(String athleteId, String competitionId, String time, String confirmedType) {
        super(athleteId, competitionId, confirmedType);
        this.time = time;
    }
}
