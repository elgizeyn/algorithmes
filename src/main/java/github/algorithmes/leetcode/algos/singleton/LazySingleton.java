package github.algorithmes.leetcode.algos.singleton;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
        // private constructor to prevent instantiation
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
