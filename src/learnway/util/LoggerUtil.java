package learnway.util;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerUtil {
    private static final Logger logger = Logger.getLogger(LoggerUtil.class.getName());

    static {
        try {
            // Configure the FileHandler
            FileHandler fileHandler = new FileHandler("application.log", true); // true for appending to the file
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new SimpleFormatter());
            
            // Add the handler to the logger
            logger.addHandler(fileHandler);

            // Optionally disable the default console handler
            Logger rootLogger = Logger.getLogger("");
            rootLogger.removeHandler(rootLogger.getHandlers()[0]);
            rootLogger.addHandler(fileHandler);

        } catch (IOException e) {
            logger.log(Level.SEVERE, "Failed to initialize logger handler", e);
        }
    }

    private LoggerUtil() {
        // Private constructor to prevent instantiation
    }

    public static Logger getLogger() {
        return logger;
    }

    public static void logInfo(String message) {
        logger.log(Level.INFO, message);
    }

    public static void logWarning(String message) {
        logger.log(Level.WARNING, message);
    }

    public static void logSevere(String message, Throwable thrown) {
        logger.log(Level.SEVERE, message, thrown);
    }
}
