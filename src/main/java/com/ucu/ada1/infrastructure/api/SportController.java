package com.ucu.ada1.infrastructure.api;

import com.ucu.ada1.application.sport.SportsRepository;
import com.ucu.ada1.domain.sport.Sport;
import java.util.List;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RestController
@RequestMapping("/sports")
public class SportController {

    SportsRepository sportsRepository;

    @Autowired
    public SportController(final SportsRepository sportsRepository) {
        this.sportsRepository = sportsRepository;
    }

    @GetMapping
    public ResponseEntity<List<Sport>> getSports() {
        final List<Sport> createdSport = sportsRepository.getSports();
        return new ResponseEntity<>(createdSport, HttpStatus.CREATED);
    }
}
