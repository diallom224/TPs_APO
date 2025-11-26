public class Logger {

    public enum LogLevel { ERROR, DEBUG, INFO }

    private static LogLevel niveau = LogLevel.ERROR; // par défaut

    public static void setLogLevel(LogLevel n) {
        niveau = n;
    }

    public static void log(LogLevel niveauMessage, String message) {
        if(niveauMessage.ordinal() <= niveau.ordinal()) {
            System.out.println("[" + niveauMessage + "] " + message);
        }
    }
}
