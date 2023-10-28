package com.bearsnake.ttt;

public class Grid {

    private static final Line[] _winningLines = new Line[]{
        new Line(0, 3, 6),
        new Line(1, 4, 7),
        new Line(2, 5, 8),
        new Line(0, 1, 2),
        new Line(3, 4, 5),
        new Line(6, 7, 8),
        new Line(0, 4, 8),
        new Line(2, 4, 6)
    };

    public final Tile[] _tiles = new Tile[9];

    public Grid() {
        for (int tx = 0; tx < 9; tx++) {
            _tiles[tx] = new Tile();
        }
    }

    public boolean takeTile(
        final int coord,
        final Player player
    ) {
        if (_tiles[coord].getPlayer() != null) {
            return false;
        }

        _tiles[coord].setPlayer(player);
        return true;
    }

    public boolean isGameOver() {
        if (whoWon() != null) {
            return true;
        }

        for (var tile : _tiles) {
            if (tile == null) {
                return false;
            }
        }

        return true;
    }

    public Player whoWon() {
        for (var line : _winningLines) {
            var coords = line.getCoordinates();
            var tile1 = _tiles[coords[0]];
            var tile2 = _tiles[coords[1]];
            var tile3 = _tiles[coords[2]];

            if (tile1.getPlayer() == tile2.getPlayer() && tile2.getPlayer() == tile3.getPlayer()) {
                return tile1.getPlayer();
            }
        }

        return null;
    }
}
