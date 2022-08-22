package github.algorithmes.leetcode.algos.strings;

public class Main {

    public static void main(String[] args) {
        String s = "abc";
        String s1 = new String("abc").intern();
        System.out.println(s==s1);
    }
}
