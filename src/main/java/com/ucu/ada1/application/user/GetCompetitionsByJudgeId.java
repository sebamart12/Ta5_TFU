package com.ucu.ada1.application.user;

import com.google.inject.ImplementedBy;
import com.ucu.ada1.application.user.impl.GetCompetitionsByJudgeIdimpl;
import com.ucu.ada1.domain.sport.Competition;
import java.util.List;
import java.util.function.Function;
import org.springframework.stereotype.Repository;

@ImplementedBy(GetCompetitionsByJudgeIdimpl.class)
@Repository
public interface GetCompetitionsByJudgeId extends Function<String , List<Competition>> {

}
