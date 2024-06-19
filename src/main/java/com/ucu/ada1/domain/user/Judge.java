package com.ucu.ada1.domain.user;

import com.ucu.ada1.domain.sport.Competition;
import com.ucu.ada1.domain.sport.Sport;
import java.util.List;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class Judge extends Person {
    List<Sport> sportSpecialist;
    List<Competition> competitions;

    @Builder
    Judge(String id, String email, String bornDate, String name, List<Sport> sportSpecialist,
          List<Competition> competitions) {
        super(id, email, bornDate, name);
        this.sportSpecialist = sportSpecialist;
        this.competitions = competitions;
    }
}
