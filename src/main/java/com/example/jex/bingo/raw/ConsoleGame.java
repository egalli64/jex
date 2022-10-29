/*
    Raw Bingo - A simple CLI app emulating a bingo game
    Only minimal Java features used

    Hosted on https://github.com/egalli64/jex
 */
package com.example.jex.bingo.raw;

import java.util.Scanner;

/**
 * Play a bingo game by CLI
 */
public class ConsoleGame {
    private final Player[] players;
    private final Extractor extractor;

    /**
     * Constructor
     *
     * @param nr the number of players
     */
    public ConsoleGame(int nr) {
        players = new Player[nr];
        extractor = new Extractor();
    }

    /**
     * Ask the user to set the game up through CLI
     *
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Raw Bingo");

        ConsoleGame game;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please, enter the number of players: ");

            // TODO: safety checks
            game = new ConsoleGame(scanner.nextInt());
            for (int i = 0; i < game.players.length; i++) {
                System.out.print("Number of cards for player " + (i + 1) + ": ");
                // TODO: safety checks
                game.setPlayer(i, scanner.nextInt());
            }
        }

        System.out.println("The winner is player " + game.play());
    }


    /**
     * Create a player
     *
     * @param id index of player
     * @param nr number of cards for player
     */
    public void setPlayer(int id, int nr) {
        players[id] = new Player(nr, extractor);
        extractor.shuffle();
    }

    /**
     * Play the bingo game
     *
     * @return the id of winner (one-based index)
     */
    public int play() {
        while (true) {
            int current = extractor.extract();
            for (int i = 0; i < players.length; i++) {
                if (players[i].check(current) == Result.WIN) {
                    return i + 1;
                }
            }
        }
    }
}
