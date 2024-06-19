package com.ucu.ada1.infrastructure.api;

import static java.util.Objects.nonNull;

import com.google.inject.Inject;
import com.ucu.ada1.application.user.GetCompetitionsByJudgeId;
import com.ucu.ada1.domain.sport.Competition;
import java.util.List;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RestController
@RequestMapping("/judge")
public class JudgeController {

    GetCompetitionsByJudgeId getCompetitionsByJudgeId;

    @Autowired
    public JudgeController(GetCompetitionsByJudgeId getCompetitionsByJudgeId) {
        this.getCompetitionsByJudgeId = getCompetitionsByJudgeId;
    }

    @GetMapping("/{judgeId}/competitions")
    public ResponseEntity<List<Competition>> getCompetitionsByJudge(@PathVariable String judgeId) {

        final var competitions = getCompetitionsByJudgeId.apply(judgeId);
        final var responseCode = nonNull(competitions) ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity<>(getCompetitionsByJudgeId.apply(judgeId), responseCode);
    }
}
