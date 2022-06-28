package com.houarizegai.tennis.service;

import com.houarizegai.tennis.dto.GameScoreDto;
import com.houarizegai.tennis.dto.InitGameDto;

public interface TennisGameService {
    void initGame(InitGameDto initGameDto);

    GameScoreDto getScore();
}
