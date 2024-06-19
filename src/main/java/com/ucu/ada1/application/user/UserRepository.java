package com.ucu.ada1.application.user;

import com.ucu.ada1.domain.user.login.Auth;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {

    Auth loginUser(String user, String password);
}
