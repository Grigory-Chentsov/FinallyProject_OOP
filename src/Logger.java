import java.util.logging.*;

// Класс Logger для регистрации сообщений
class Logger {
    private static final Logger LOGGER = Logger.getLogger(Logger.class.getName());

    public static void log(String message) {
        LOGGER.log(Level.INFO, message);
    }
}
