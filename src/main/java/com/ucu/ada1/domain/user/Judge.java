package com.ucu.ada1.domain.user;

import com.ucu.ada1.domain.sport.Sport;
import java.util.List;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class Judge extends Person {
    List<Sport> sportSpecialist;

    Judge(String id, String user, String password, String email, String bornDate, List<Sport> sportSpecialist) {
        super(id, user, password, email, bornDate);
        this.sportSpecialist = sportSpecialist;
    }
}
