package com.ucu.ada1.domain.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@Data
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class Person {
    String id;
    @JsonIgnore String email;
    @JsonIgnore String bornDate;
    String name;
}

