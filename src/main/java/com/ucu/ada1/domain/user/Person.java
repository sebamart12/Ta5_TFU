package com.ucu.ada1.domain.user;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Builder
@Data
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class Person {
    String id;
    String user;
    String password;
    String email;
    String bornDate;
}

