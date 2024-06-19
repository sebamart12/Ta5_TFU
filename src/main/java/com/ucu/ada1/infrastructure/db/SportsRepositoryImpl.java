package com.ucu.ada1.infrastructure.db;

import com.ucu.ada1.application.sport.SportsRepository;
import com.ucu.ada1.domain.score.TimeScore;
import com.ucu.ada1.domain.sport.Sport;
import com.ucu.ada1.domain.user.Athlete;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class SportsRepositoryImpl implements SportsRepository {
    @Override
    public List<Sport> getSports() {
        return List.of(
                Sport.builder()
                        .id("1")
                        .name("Natacion")
                        .build(),
                Sport.builder()
                        .id("2")
                        .name("Halterofilia")
                        .build(),
                Sport.builder()
                        .id("3")
                        .name("Surf")
                        .build(),
                Sport.builder()
                        .id("4")
                        .name("Atletismo")
                        .build(),
                Sport.builder()
                        .id("5")
                        .name("Esgrima")
                        .build()
        );
    }

    @Override
    public List<Athlete> getParticipants(final String competitionId) {
        switch (competitionId) {
        case "competition1" :
            return List.of(Athlete.builder()
                .id("1")
                .name("H. Barbosa")
                .country("Uruguay")
                .scores(List.of(
                        TimeScore.builder()
                                .competitionId("1")
                                .athleteId("1")
                                .time("1:06")
                                .confirmedType("NotYet")
                                .build()
                ))
                .build(),
                Athlete.builder()
                        .id("2")
                        .name("M. Perez")
                        .country("USA")
                        .scores(List.of(
                                TimeScore.builder()
                                        .competitionId("1")
                                        .athleteId("2")
                                        .time("1:17")
                                        .confirmedType("Confirmed")
                                        .build()
                        ))
                        .build(),
                Athlete.builder()
                        .id("3")
                        .name("T. Agostini")
                        .country("Italia")
                        .scores(List.of(
                                TimeScore.builder()
                                        .competitionId("1")
                                        .athleteId("3")
                                        .time("1:02")
                                        .confirmedType("Declined")
                                        .build()
                        ))
                        .build());
    }
        return null;
    }
}
