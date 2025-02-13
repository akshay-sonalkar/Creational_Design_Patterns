/**
 * Singleton class to log messages
 *  - This is a simple implementation of the Singleton design pattern.
 *  - The getInstance() method is synchronized to ensure thread safety.
 *  - This implementation is not the most efficient Singleton design pattern.
 *
 */
public class Logger {
    private static Logger instance;

    private Logger() {
        // Initialize the logger
    }

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}