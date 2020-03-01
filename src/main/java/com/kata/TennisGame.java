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
        if(hasWinner() )
            return "Player One Wins";
        if(IsDeuce())
            return "Deuce";
        if(hasAdvantage() )
            return "Player One Advantage";
        if(hasEqualPointScore())
            return translateScore(playerOne.pointScore) + " All";
        return translateScore(playerOne.pointScore) + " " + translateScore(playerTwo.pointScore);
    }

    private Boolean hasWinner(){
        return playerOne.pointScore > 3 && playerOne.pointScore > playerTwo.pointScore + 1;
    }

    private Boolean IsDeuce(){
        return playerOne.pointScore >= 3 && playerOne.pointScore == playerTwo.pointScore ;
    }

    private Boolean hasAdvantage(){
        return playerOne.pointScore >= 3 && playerOne.pointScore > playerTwo.pointScore ;
    }

    private Boolean hasEqualPointScore(){
        return playerOne.pointScore == playerTwo.pointScore ;
    }

    private TennisPoints translateScore(int pointScore) {
        switch (pointScore) {
            case 3:
                return TennisPoints.Forty;
            case 2:
                return TennisPoints.Thirty;
            case 1:
                return TennisPoints.Fifteen;
            case 0:
                return TennisPoints.Love;
        }
        throw new IllegalArgumentException("Illegal pointScore: " + pointScore);
    }

    public enum TennisPoints{
        Love,
        Fifteen,
        Thirty,
        Forty
    }
}
