package com.example.jex.hex;

public class Pawn {
    private final Color color;
    private final Pawn parent;
    private final int groupSize;

    public Pawn(Color color) {
        this.color = color;
        this.parent = this;
        this.groupSize = 1;
    }

    @Override
    public String toString() {
        return "Pawn{" + "color=" + color + ", groupSize=" + groupSize + '}';
    }

    public enum Color {
        RED, BLUE, NONE;

        public static Color from(String s) {
            return switch (s) {
                case "R" -> RED;
                case "B" -> BLUE;
                default -> NONE;
            };
        }
    }
}
