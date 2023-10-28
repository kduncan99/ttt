package com.bearsnake.ttt;

public class Line {

    private final int[] _coordinates;

    public Line(
        final int coordinate1,
        final int coordinate2,
        final int coordinate3
    ) {
       _coordinates = new int[]{ coordinate1, coordinate2, coordinate3 };
    }

    public int[] getCoordinates() { return _coordinates; }
}
