package com.ucu.ada1.application.sport;

import com.ucu.ada1.domain.sport.Competition;
import com.ucu.ada1.domain.sport.Sport;
import com.ucu.ada1.domain.user.Athlete;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface SportsRepository {

    List<Sport> getSports();

    List<Athlete> getParticipants(String competitionId);
}
