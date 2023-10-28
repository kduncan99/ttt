package com.bearsnake.ttt;

public class Main {
    public static void main(
        String[] args
    ) {
        char[] tval= new char[9];
        Grid grid = new Grid();
        Player[] players = new Player[]{
            new Player("Player 1", 'X'),
            new Player("Player 2", 'O'),
        };

        int turn = 0; // index of player whose turn it is
        while (!grid.isGameOver()) {
            for(int xx=0;xx<8;xx++){
                if(grid._tiles[xx].getPlayer() == null){
                    tval[xx]=' '; // assign blank to null
                } else if (grid._tiles[xx].getPlayer().getToken() == 'X') {
                    tval[xx]='X'; // assign x to x
                } else if (grid._tiles[xx].getPlayer().getToken() == 'O'){
                    tval[xx]='O'; // assign o to o
                }
            }
            System.out.printf("%c%c%c\n%c%c%c\n%c%c%c\n",
                    tval[0],tval[1],tval[2],
                    tval[3],tval[4],tval[5],
                    tval[6],tval[7],tval[8]
            );

            //  allow the player whose turn it is, to choose a tile
            var player = players[turn];
            var coord = player.takeTurn(grid);
            System.out.printf("%s chose coordinate %d...\n", player.getName(), coord);

            if (!grid.takeTile(coord, player)) {
                System.out.println("This tile has already been taken!");
            } else {
                //  next turn
                turn = 1 - turn;
            }
        }

        if (grid.whoWon() == null) {
            System.out.println("The cat won.");
        } else {
            System.out.println("");
        }
    }
}
// TODO put in a bunch of comments