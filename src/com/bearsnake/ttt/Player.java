package com.bearsnake.ttt;

public class Player {

    private final String _name;
    private final char _token;

    public Player(
        final String name,
        final char token
    ) {
        _name = name;
        _token = token;
    }

    public String getName() { return _name; }
    public char getToken() { return _token; }

    /**
     * Code chooses the best tile for this player's next turn,
     * and returns the coordinate (0 to 8) of that tile.
     * Should go without saying, that the coordinate should refer to a tile which does not yet have a player value.
     * @param grid reference to the game grid
     * @return coordinate of chosen tile
     */
    public int takeTurn(
        final Grid grid
    ) {
        //  TODO put thing here
    }
}
