package com.ucu.ada1.infrastructure.db;

import com.ucu.ada1.application.user.UserRepository;
import com.ucu.ada1.domain.sport.Competition;
import com.ucu.ada1.domain.sport.Sport;
import com.ucu.ada1.domain.user.Judge;
import com.ucu.ada1.domain.user.login.Auth;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserRepositoryImpl implements UserRepository {
    @Override
    public Auth loginUser(final String user, final String password) {
        switch (user) {
            case "prueba1":
                return "prueba1".equals(password) ? Auth.builder().token("123").build() : null;
        }
        return null;
    }

    @Override
    public Judge getJudge(final String judgeId) {
        switch (judgeId) {
            case "judge1":
                return Judge.builder()
                        .id("judge1")
                        .bornDate("10/05/1998")
                        .email("judge1@gmail.com.uy")
                        .sportSpecialist(List.of(
                                Sport.builder()
                                        .id("1")
                                        .name("Natacion")
                                        .build()
                        ))
                        .competitions(List.of(
                                Competition.builder()
                                        .id("1")
                                        .name("100mts libre")
                                        .date("19/06/2024")
                                        .build(),
                                Competition.builder()
                                        .id("2")
                                        .name("100mts mariposa")
                                        .date("21/06/2024")
                                        .build(),
                                Competition.builder()
                                        .id("3")
                                        .name("100mts espalda")
                                        .date("25/06/2024")
                                        .build()
                        ))
                        .build();
        }
        return null;
    }
}
