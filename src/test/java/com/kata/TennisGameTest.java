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
        assertEquals("Love All",game.getScore());
    }



}
