package com.ucu.ada1.domain.user;

import com.ucu.ada1.domain.sport.Category;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class Athlete {
    String country;
    Category category;
}
