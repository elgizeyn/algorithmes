package github.algorithmes.leetcode.algos.strings;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        StringBuilder result = new StringBuilder();
        String first = strs[0];
        for (int j = 0; j < first.length(); j++) {
            int count = 0;
            for (String str : strs) {
                if (j < str.length() && first.charAt(j) == str.charAt(j)) {
                    count++;
                } else {
                    return result.toString();
                }
            }
            if (count == strs.length) {
                result.append(first.charAt(j));
            }
        }
        return result.toString();
    }
}
