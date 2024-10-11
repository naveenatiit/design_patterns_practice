package _04singleton_pattern._04solution;

public enum Logger {
    INSTANCE;
    public static Logger getLogger() {
        return INSTANCE;
    }

    public void log(String str) {
        System.out.println(str);
    }
}
