# Tennis
Project to implement simple tennis game which is played by 2 players.
winner of this game is decided based on the points scored by each player.

More info on the rules at: [Tennis Scoring](http://en.wikipedia.org/wiki/Tennis#Scoring)

The scoring system is rather simple:

1. Each player can have either of these points in one game 0 15 30 40

2. If you have 40 and you win the ball you win the game, however there are special rules.

3. If both have 40 the players are deuce. a. If the game is in deuce, the winner of a ball will have advantage and game ball. b.
If the player with advantage wins the ball he wins that game. If the player without advantage wins they are back at deuce.

# Purpose
This is an Practice program to showcase Test Driven Development

# Functional Case:

````
-Should return game score as "Love All" when both player are at zero points
-Should return game score as "Fifteen Love" when player one wins first point
-Should return game score as "Player One Wins"  when player one wins 4 and player two wins 2 points
-Should return game score as "Deuce" when at least three points have been scored by each player, and the scores are equal
-Should return game score as "Player One Advantage" when  player one scores one point post deuce
-Should return game score as "Player Two Wins"  when player two wins 4 and player two wins 2 points

````

# Prerequisite:

````
Jdk 1.7 or above
IDE (Eclipse or Intellij)
Maven 3.0
````

# How to run this App

Follow below instructions to run this app
````
-git clone https://github.com/dishantj4/Tennis.git
-Go to src/test/java/com/kata/TennisGameTest.java and run the Junit Test case or run below maven command.

$ mvn clean test

````

# Code Coverage

View Code Coverage Report at ‘target/site/jacoco/index.html’





