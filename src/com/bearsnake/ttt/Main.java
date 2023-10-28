package com.bearsnake.ttt;

public class Main {

    public static void main(
        String[] args
    ) {
        Grid grid = new Grid();
        Player[] players = new Player[]{
            new Player("Player 1", 'X'),
            new Player("Player 2", 'O'),
        };

        int turn = 0; // index of player whose turn it is
        while (!grid.isGameOver()) {
            //  TODO display grid in standard form

            //  allow the player whose turn it is, to choose a tile
            var player = players[turn];
            var coord = player.takeTurn(grid);
            System.out.printf("%s chose coordinate %d...\n", player.getName(), coord);

            if (!grid.takeTile(coord, player)) {
                //  TODO complain about trying to take a tile which is already taken
            } else {
                //  next turn
                turn = 1 - turn;
            }
        }

        if (grid.whoWon() == null) {
            //  TODO say the cat won
        } else {
            //  TODO display name of player who won
        }
    }
}
