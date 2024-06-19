package com.ucu.ada1.application.user.impl;

import static java.util.Objects.nonNull;

import com.ucu.ada1.application.user.GetCompetitionsByJudgeId;
import com.ucu.ada1.application.user.UserRepository;
import com.ucu.ada1.domain.sport.Competition;
import com.ucu.ada1.domain.user.Judge;
import java.util.List;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Service
public class GetCompetitionsByJudgeIdimpl implements GetCompetitionsByJudgeId {

    UserRepository userRepository;

    @Autowired
    public GetCompetitionsByJudgeIdimpl(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<Competition> apply(final String judgeId) {
        final Judge judge = userRepository.getJudge(judgeId);
        return nonNull(judge) ? judge.getCompetitions() : null;
    }
}
