package com.ucu.ada1.infrastructure.api;

import static java.util.Objects.nonNull;

import com.ucu.ada1.application.user.UserRepository;
import com.ucu.ada1.domain.user.login.Auth;
import com.ucu.ada1.domain.user.login.UserLogin;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RestController
@RequestMapping("/user")
public class UserController {

    UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/auth/login")
    public ResponseEntity<Auth> isLogged(@RequestBody UserLogin login) {
        final Auth auth = userRepository.loginUser(login.getUser(), login.getPassword());
        return new ResponseEntity<>(auth, nonNull(auth) ? HttpStatus.OK : HttpStatus.FORBIDDEN);
    }
}
