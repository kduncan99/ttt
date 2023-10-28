package com.bearsnake.ttt;

public class Main {

    public static void main(
        String[] args
    ) {
        Grid g = new Grid();
        Player[] players = new Player[]{
            new Player("Player 1", 'X'),
            new Player("Player 2", 'O'),
        };

        Player turn = players[0];
        while (!g.isGameOver()) {
            //  TODO stuffs
        }

        if (g.whoWon() == null) {
            //  TODO
        } else {
            //  TODO
        }
    }
}
