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
}
