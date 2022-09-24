/*
    PhoneBook - A simple CLI app to manage a phonebook

    Hosted on https://github.com/egalli64/jex
 */
package phonebook;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Start the app
 */
public class ConsoleMain {
    private static final Logger logger = LoggerFactory.getLogger(ConsoleMain.class);
    private static final String DEFAULT_FILENAME = "phonebook.dump";

    public static void main(String[] args) {
        String filename = args.length == 0 ? DEFAULT_FILENAME : args[0];
        logger.trace("Using file {} to persist the phonebook", filename);
        try (Book book = new Book(filename)) {
            book.insert("Tom", "123-456-7890");
        }
    }
}
