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
            return winnerPlayerName() + " " + TennisPoints.Wins;
        if(isDeuce())
            return "" + TennisPoints.Deuce;
        if(hasAdvantage() )
            return advantagePlayerName() + " " + TennisPoints.Advantage;
        if(hasEqualPointScore())
            return translateScore(playerOne.pointScore) + " All";
        return translateScore(playerOne.pointScore) + " " + translateScore(playerTwo.pointScore);
    }


    private Boolean playerOneIsWinner(){
        return hasPointScoreMoreThanForty() && playerOne.pointScore > playerTwo.pointScore + 1;
    }

    private Boolean playerTwoIsWinner(){
        return hasPointScoreMoreThanForty() && playerTwo.pointScore > playerOne.pointScore + 1;
    }

    private Boolean hasWinner(){
        return playerOneIsWinner() || playerTwoIsWinner();
    }

    private String winnerPlayerName(){
        if(playerOneIsWinner())
            return playerOne.playerName;
        else
            return playerTwo.playerName;
    }


    private Boolean isDeuce(){
        return playerOne.pointScore >= 3 && hasEqualPointScore() ;
    }

    private Boolean playerOneHasAdvantage(){
        return hasPointScoreMoreThanForty() && playerOne.pointScore > playerTwo.pointScore ;
    }

    private Boolean playerTwoHasAdvantage(){
        return hasPointScoreMoreThanForty() && playerOne.pointScore < playerTwo.pointScore ;
    }

    private Boolean hasAdvantage(){
         return playerOneHasAdvantage() || playerTwoHasAdvantage();
    }

    private String advantagePlayerName() {
        if(playerOneHasAdvantage())
            return playerOne.playerName;
        else
            return playerTwo.playerName;
    }

    private Boolean hasEqualPointScore(){
        return playerOne.pointScore == playerTwo.pointScore ;
    }

    private Boolean hasPointScoreMoreThanForty(){
        return playerOne.pointScore > 3 || playerTwo.pointScore > 3 ;
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

}
