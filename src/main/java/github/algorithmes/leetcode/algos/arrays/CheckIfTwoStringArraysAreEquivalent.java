package github.algorithmes.leetcode.algos.arrays;

import lombok.experimental.var;

public class CheckIfTwoStringArraysAreEquivalent {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        for (var word : word1)
            builder1.append(word);
        for (var word : word2)
            builder2.append(word);
        return builder1.toString().equals(builder2.toString());
    }
}
