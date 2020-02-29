package com.kata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class TennisGameTest
{

    @Test
    public void shouldReturnGameScoreAsLoveAllWhenBothPlayerAreAtZeroPoints()
    {
        Player playerOne = new Player("Player One");
        Player playerTwo = new Player("Player Two");
        TennisGame game = new TennisGame(playerOne,playerTwo);
        playerOne.pointScore =0;
        playerTwo.pointScore =0;
        assertEquals("Love All",game.getScore());
    }

    @Test
    public void shouldReturnGameScoreAsFifteenLoveWhenPlayerOneWinsFirstPoint()
    {
        Player playerOne = new Player("Player One");
        Player playerTwo = new Player("Player Two");
        TennisGame game = new TennisGame(playerOne,playerTwo);
        playerOne.pointScore =1;
        playerTwo.pointScore =0;
        assertEquals("Fifteen Love",game.getScore());
    }

}
