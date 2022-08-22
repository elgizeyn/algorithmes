package github.algorithmes.leetcode.algos.arrays;

public class ShuffleString {

    public String restoreString(String s, int[] indices) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            for (int k = 0; k < s.length(); k++) {
                if (i == indices[k])
                    builder.append(s.charAt(k));
            }
        }
        return builder.toString();
    }
}
