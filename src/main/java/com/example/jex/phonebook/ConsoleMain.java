/*
    PhoneBook - A simple CLI app to manage a phonebook

    Hosted on https://github.com/egalli64/jex
 */
package com.example.jex.phonebook;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * User interaction through CLI
 */
public class ConsoleMain implements AutoCloseable {
    private static final Logger log = LoggerFactory.getLogger(ConsoleMain.class);
    private static final String DEFAULT_FILENAME = "phonebook.dump";

    private final Book book;
    private final Scanner scanner;

    public ConsoleMain(String filename) {
        this.book = new Book(filename);
        this.scanner = new Scanner(System.in);
    }

    /**
     * Loop on the CLI input manager
     *
     * @param args the persisted phonebook, when not using the default one
     */
    public static void main(String[] args) {
        String filename = args.length == 0 ? DEFAULT_FILENAME : args[0];
        log.trace("Using file {} to persist the phonebook", filename);

        try (ConsoleMain cm = new ConsoleMain(filename)) {
            cm.inputManager();
        } catch (Exception ex) {
            log.error("Input interrupted?", ex);
        }
        System.out.println("See you later");
    }

    /**
     * Show the current phone book status
     * <p>
     * Ask the user what to do next, until termination
     */
    public void inputManager() {
        Command command;
        do {
            book.print(System.out);
            System.out.print("[I]nsert, [R]emove, e[X]it? ");
            command = getCommand();
            log.trace("Command is {}", command);
            switch (command) {
            case INSERT -> insert();
            case REMOVE -> remove();
            case UNKNOWN -> System.out.println("Unknown command");
            case EXIT -> log.debug("Terminating");
            }
        } while (command != Command.EXIT);
    }

    /**
     * Ask the user which name remove, then remove it
     */
    private void remove() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        if (!book.remove(name)) {
            System.out.println(name + " _NOT_ removed!");
        }
    }

    /**
     * Ask the user the entry, then add it to the phonebook
     */
    private void insert() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Phone number: ");
        String phone = scanner.nextLine();
        if (!book.insert(name, phone)) {
            System.out.println(name + " _NOT_ inserted!");
        }
    }

    /**
     * Convert the user input to a command
     *
     * @return the command
     */
    private Command getCommand() {
        if (scanner.hasNext()) {
            String input = scanner.nextLine().toUpperCase();
            return Command.from(input.matches("^[IRX].*") ? input.charAt(0) : 'U');
        } else {
            return Command.UNKNOWN;
        }
    }

    @Override
    public void close() {
        scanner.close();
        book.close();
    }
}
