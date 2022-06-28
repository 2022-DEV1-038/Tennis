package com.houarizegai.tennis.service;

import java.util.HashMap;
import java.util.Map;

public class TennisGame {

    private final String firstPlayerName;
    private final String secondPlayerName;

    private int firstPlayerScore;
    private int secondPlayerScore;

    private static final Map<Integer, String> SCORES = new HashMap<>();

    static {
        SCORES.put(0, "Love");
        SCORES.put(1, "Fifteen");
        SCORES.put(2, "Thirty");
        SCORES.put(3, "Forty");
    }

    public TennisGame(String firstPlayerName, String secondPlayerName) {
        this.firstPlayerName = firstPlayerName;
        this.secondPlayerName = secondPlayerName;
    }

    public String getScore() {
        if(firstPlayerScore == secondPlayerScore) {
            if(firstPlayerScore >= 3) {
                return "Deuce";
            }

            return SCORES.get(firstPlayerScore) + " All";
        }

        if(firstPlayerScore > 3) {
            if(firstPlayerScore - secondPlayerScore == 1) {
                return firstPlayerName + " Advantage";
            }
            if(firstPlayerScore - secondPlayerScore >= 2) {
                return firstPlayerName + " Win";
            }
        }
        if(secondPlayerScore > 3) {
            if(secondPlayerScore - firstPlayerScore == 1) {
                return secondPlayerName + " Advantage";
            }
        }

        return SCORES.get(firstPlayerScore) + " " + SCORES.get(secondPlayerScore);
    }

    public void firstPlayerWin() {
        firstPlayerScore++;
    }

    public void secondPlayerWin() {
        secondPlayerScore++;
    }
}
