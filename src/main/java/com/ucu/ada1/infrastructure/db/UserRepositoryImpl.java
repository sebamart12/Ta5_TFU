package com.ucu.ada1.infrastructure.db;

import com.ucu.ada1.application.user.UserRepository;
import com.ucu.ada1.domain.user.login.Auth;
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
}
