/*
    Exercism Java track

    Source: exercism.org/tracks/java/exercises/connect
    My solutions: https://github.com/egalli64/jex

    Connect: Compute the result for a game of Hex / Polygon.
 */
package org.exercism.track.hex;

/**
 * A pawn in the board
 */
public class Pawn {
    private final Winner color;
    private Pawn parent;
    private int size;

    /**
     * Constructor - set the color, the parent to itself, the group size to 1
     *
     * @param color the pawn color, actually X or O
     */
    public Pawn(Winner color) {
        this.color = color;
        this.parent = this;
        this.size = 1;
    }

    /**
     * Getter
     *
     * @return the color
     */
    public Winner getColor() {
        return color;
    }

    /**
     * Getter
     *
     * @return the parent
     */
    public Pawn getParent() {
        return parent;
    }

    /**
     * Setter
     *
     * @param parent the parent
     */
    public void setParent(Pawn parent) {
        this.parent = parent;
    }

    /**
     * Getter
     *
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * Change the size
     *
     * @param delta to be added to the current size
     */
    public void addSize(int delta) {
        size += delta;
    }

    @Override
    public String toString() {
        return "Pawn{" + "color=" + color + ", size=" + size + '}';
    }
}
