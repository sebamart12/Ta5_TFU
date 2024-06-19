package com.ucu.ada1.domain.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ucu.ada1.domain.score.Score;
import com.ucu.ada1.domain.sport.Category;
import java.util.List;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.experimental.FieldDefaults;

@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class Athlete extends Person {
    @JsonProperty String country;
    Category category;
    @JsonProperty List<Score> scores;
    @Builder
    public Athlete(String id, String email, String bornDate, String name, String country, Category category,
                   List<Score> scores) {
        super(id, email, bornDate, name);
        this.country = country;
        this.category = category;
        this.scores = scores;
    }
}
