/*
    Hex - Logic for a Hex game
    https://en.wikipedia.org/wiki/Hex_(board_game)

    Hosted on https://github.com/egalli64/jex
 */
package com.example.jex.hex;

/**
 * A pawn in the game
 */
public class Pawn {
    private final Color color;
    private Pawn parent;
    private int groupSize;

    /**
     * Constructor - a pawn has a given color and starts in its own group
     *
     * @param color the pawn color
     */
    public Pawn(Color color) {
        this.color = color;
        this.parent = this;
        this.groupSize = 1;
    }

    /**
     * Getter
     *
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Getter
     *
     * @return the pawn group leader
     */
    public Pawn getParent() {
        return parent;
    }

    /**
     * Setter
     *
     * @param parent new pawn group leader
     */
    public void setParent(Pawn parent) {
        if (parent.color != this.color) {
            throw new IllegalArgumentException("Parent should be of the same color");
        }
        this.parent = parent;
    }

    /**
     * Getter
     *
     * @return the group size
     */
    public int getGroupSize() {
        return groupSize;
    }

    /**
     * Change the current group size
     *
     * @param delta number of pawns added to this group
     */
    public void addGroupSize(int delta) {
        groupSize += delta;
    }

    @Override
    public String toString() {
        return "Pawn{" + "color=" + color + ", groupSize=" + groupSize + '}';
    }

}
