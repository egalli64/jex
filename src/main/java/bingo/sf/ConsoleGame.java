/*
    SF Bingo - A simple CLI app emulating a bingo game

    Hosted on https://github.com/egalli64/jex
 */
package bingo.sf;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Play a bingo game by CLI
 */
public class ConsoleGame {
    private final List<Player> players;
    private final Extractor extractor;

    public ConsoleGame() {
        players = new ArrayList<>();
        extractor = new Extractor();
    }

    /**
     * Ask the user to set the game up through CLI
     *
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println("Welcome to CLI Bingo");

        ConsoleGame game = new ConsoleGame();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please, enter the number of players: ");

            // TODO: safety checks
            int size = scanner.nextInt();
            for (int i = 0; i < size; i++) {
                System.out.print("Number of cards for player " + (i + 1) + ": ");
                // TODO: safety checks
                game.setPlayer(scanner.nextInt());
            }
        }

        System.out.println("The winner is player " + game.play());
    }


    /**
     * Create a player
     *
     * @param nr number of cards for player
     */
    public void setPlayer(int nr) {
        players.add(new Player(nr, extractor));
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
            for (int i = 0; i < players.size(); i++) {
                if (players.get(i).check(current) == Result.WIN) {
                    return i + 1;
                }
            }
        }
    }
}
