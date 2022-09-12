public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.split(":")[1].strip();
    }

    public static String logLevel(String logLine) {
        return logLine.split(":")[0].strip().replace("[", "").replace("]", "").toLowerCase();
    }

    public static String reformat(String logLine) {
        return String.format("%s (%s)", message(logLine), logLevel(logLine)); 
    }

    public static void main(String[] args) {
        String logLine = "[ERROR]: \t Corrupt disk\t \t \r\n";
        System.out.println(reformat(logLine));
        System.out.println(message(logLine));
        System.out.println(logLevel(logLine));
    }
}
