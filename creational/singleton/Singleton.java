import java.util.HashMap;

public final class Singleton {
    private static Singleton INSTANCE = null;
    private static HashMap<String, String> items = new HashMap<String, String>();

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }

        return INSTANCE;
    }

    public static synchronized void set(String key, String value) {
        items.put(key, value);
    }
}
