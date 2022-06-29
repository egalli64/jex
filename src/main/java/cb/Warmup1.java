package cb;

public class Warmup1 {
    /**
     *
     * @param weekday true from Monday to Friday
     * @param vacation true if it is a day off
     * @return true if not a weekday or in vacation
     */
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}
