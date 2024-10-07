package github.algorithmes.leetcode.algos.singleton;

public class EagerSingleton {
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
        // private constructor to prevent instantiation
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
