package com.kata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class TennisGameTest
{
    Player playerOne;
    Player playerTwo;
    TennisGame game;

    @Before
    public void init() {
        playerOne = new Player("Player One");
        playerTwo = new Player("Player Two");
        game = new TennisGame(playerOne,playerTwo);
    }

    @Test
    public void shouldReturnGameScoreAsLoveAllWhenBothPlayerAreAtZeroPoints()
    {
        playerOne.pointScore =0;
        playerTwo.pointScore =0;
        assertEquals("Love All",game.getScore());
    }

    @Test
    public void shouldReturnGameScoreAsFifteenLoveWhenPlayerOneWinsFirstPoint()
    {
        playerOne.pointScore =1;
        playerTwo.pointScore =0;
        assertEquals("Fifteen Love",game.getScore());
    }

    @Test
    public void ShouldReturnGameScoreAsPlayerOneWinsWhenPlayerOneWins4AndPlayerTwoWins2Points()
    {
        playerOne.pointScore =4;
        playerTwo.pointScore =2;
        assertEquals("Player One Wins",game.getScore());
    }

}
