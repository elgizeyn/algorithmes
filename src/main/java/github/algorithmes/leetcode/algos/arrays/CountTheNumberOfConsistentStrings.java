package github.algorithmes.leetcode.algos.arrays;

public class CountTheNumberOfConsistentStrings {

    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String s : words) {
            int c1 = 0;
            for (char c : s.toCharArray()) {
                for (char k : allowed.toCharArray()) {
                    if (c == k)
                        c1++;
                }
            }
            if (c1 == s.length())
                count++;
        }
        return count;
    }
}
