package com.ucu.ada1.infrastructure.db;

import com.ucu.ada1.application.sport.SportsRepository;
import com.ucu.ada1.domain.sport.Sport;
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
}
