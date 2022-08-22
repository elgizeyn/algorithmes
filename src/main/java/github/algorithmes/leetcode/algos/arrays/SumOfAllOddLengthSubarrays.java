package github.algorithmes.leetcode.algos.arrays;

import java.util.HashSet;
import java.util.Set;

public class SumOfAllOddLengthSubarrays {

    public int sumOddLengthSubarrays(int[] arr) {
        Set<Integer> odds = new HashSet<>();
        for (int i = 1; i <= arr.length; i++) {
            if (i % 2 == 1)
                odds.add(i - 1);
        }
        // 1, 3, 5 -> {0, 2, 4}
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int odd : odds) {
                if (i + odd < arr.length) {
                    for (int k = i; k <= i + odd; k++) {
                        sum += arr[k];
                    }
                }
            }
        }
        return sum;
    }
}
