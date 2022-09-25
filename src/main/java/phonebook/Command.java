/*
    PhoneBook - A simple CLI app to manage a phonebook

    Hosted on https://github.com/egalli64/jex
 */
package phonebook;

/**
 * The available commands
 */
public enum Command {
    INSERT, REMOVE, EXIT, UNKNOWN;

    /**
     * Static factory method
     *
     * @param c short for a command
     * @return the associated command, or UNKNOWN
     */
    public static Command from(char c) {
        return switch (c) {
            case 'I' -> INSERT;
            case 'R' -> REMOVE;
            case 'X' -> EXIT;
            default -> UNKNOWN;
        };
    }
}
