package com.ucu.ada1.domain.sport;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ucu.ada1.domain.user.Athlete;
import java.util.List;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class Competition {
    @JsonIgnore String id;
    String name;
    String date;
    @JsonIgnore List<Athlete> participants;
}
