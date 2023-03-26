package com.example.jex.hex;

public class BoardBuilder {
    public static final int DEFAULT_SIZE = 8;
    private final int size;
    private final int i;
    private final int j;
    private final Board board;

    public BoardBuilder() {
        this(DEFAULT_SIZE);
    }

    public BoardBuilder(int size) {
        this.size = size;
        this.i = 0;
        this.j = 0;
        this.board = new Board();
    }

    public Board toBoard() {
        if (i != size || j != size) {
            throw new IllegalStateException(String.format("Mismatching sizes: %d, %d, %d", size, i, j));
        }
        return board;
    }
}
