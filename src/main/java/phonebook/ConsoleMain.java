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
 * Start the phonebook, load/save it on file
 */
public class ConsoleMain {
    private static final Logger logger = LoggerFactory.getLogger(ConsoleMain.class);
    /**
     * where the phonebook is serialized
     */
    private static final String FILENAME = "phonebook.dump";

    /**
     * Load the phonebook from file
     * <p>
     * If file not found, an empty phonebook is generated
     *
     * @return the phonebook in a map
     */
    private static Map<String, String> load() {
        Map<String, String> result = new TreeMap<>();

        try (Scanner scanner = new Scanner(new FileInputStream(FILENAME))) {
            while (scanner.hasNext()) {
                String[] entry = scanner.nextLine().split("=");
                logger.trace("Scanning {}", Arrays.toString(entry));
                result.put(entry[0], entry[1]);
            }
        } catch (Exception ex) {
            logger.warn("Can't access {}", FILENAME);
        }

        return result;
    }

    /**
     * Save the phonebook to file
     *
     * @param book the map representing the current phonebook status
     */
    private static void save(Map<String, String> book) {
        try (PrintWriter writer = new PrintWriter(new FileOutputStream(FILENAME))) {
            for (var entry : book.entrySet()) {
                writer.println(entry);
            }
        } catch (Exception ex) {
            logger.error("Can't access {}", FILENAME);
            throw new IllegalArgumentException(ex);
        }
    }

    public static void main(String[] args) {
        Map<String, String> book = load();

        save(book);
    }
}
