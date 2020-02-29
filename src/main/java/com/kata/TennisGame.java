package com.kata;

public class TennisGame
{

    Player playerOne;
    Player playerTwo;

    public TennisGame(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public String getScore() {
        
        String score = null;

        if(playerOne.pointScore == 0 && playerTwo.pointScore == 0)
            score = "Love All";
        if(playerOne.pointScore == 1 && playerTwo.pointScore == 0)
            score = "Fifteen Love";
            
        return score;
    }
}
