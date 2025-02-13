/**
 * Bill Pugh Singleton Implementation
 *  - This is the most widely used approach for Singleton design pattern as it doesn't require synchronization.
 *  - The inner static class is not loaded into memory until the getInstance() method is called.
 *  - This solution is thread-safe without requiring special language constructs (e.g. volatile or synchronized).
 *  - The Bill Pugh Singleton implementation is the most efficient Singleton design pattern.
 *
 */
public class LoggerClass {
    private LoggerClass() {
        // Initialize the logger
    }

    private static class LoggerHelper {
        private static final LoggerClass INSTANCE = new LoggerClass();
    }

    public static LoggerClass getInstance() {
        return LoggerHelper.INSTANCE;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}