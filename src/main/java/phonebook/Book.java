/*
    PhoneBook - A simple CLI app to manage a phonebook

    Hosted on https://github.com/egalli64/jex
 */
package phonebook;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * The phonebook manager
 */
public class Book implements AutoCloseable {
    private static final Logger logger = LoggerFactory.getLogger(Book.class);

    /**
     * The phonebook as map name: phone number
     */
    private final Map<String, String> map;

    /**
     * Where this phonebook is persisted
     */
    private final String filename;

    /**
     * Load the phonebook from file, or an empty phonebook is generated
     *
     * @param filename for persistence
     */
    public Book(String filename) {
        this.filename = filename;
        this.map = new TreeMap<>();

        try (Scanner scanner = new Scanner(new FileInputStream(filename))) {
            while (scanner.hasNext()) {
                String[] entry = scanner.nextLine().split("=");
                logger.trace("Scanning {}", Arrays.toString(entry));
                map.put(entry[0], entry[1]);
            }
        } catch (Exception ex) {
            logger.warn("Can't access {}", filename);
        }
    }

    /**
     * Insert new entry in the book
     *
     * @param name        key
     * @param phoneNumber value
     */
    public void insert(String name, String phoneNumber) {
        logger.trace("Inserting {}: {}", name, phoneNumber);
    }

    /**
     * Save the phonebook to file
     *
     * @throws IllegalArgumentException if it can't persist the phonebook
     */
    @Override
    public void close() throws IllegalArgumentException {
        try (PrintWriter writer = new PrintWriter(new FileOutputStream(filename))) {
            for (var entry : map.entrySet()) {
                writer.println(entry);
            }
        } catch (Exception ex) {
            logger.error("Can't access {}", filename);
            throw new IllegalArgumentException(ex);
        }
    }
}
