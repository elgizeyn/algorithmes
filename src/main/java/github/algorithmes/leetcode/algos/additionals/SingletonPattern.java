package github.algorithmes.leetcode.algos.additionals;

public class SingletonPattern {

    private static final SingletonPattern SINGLETON_PATTERN = new SingletonPattern();

    private SingletonPattern() {
    }

    // DI: loosely coupling
    // DI enables Spring to implement IoC

    public static SingletonPattern getInstance() {
        return SINGLETON_PATTERN;
    }
}