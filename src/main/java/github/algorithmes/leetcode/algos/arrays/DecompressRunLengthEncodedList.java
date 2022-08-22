package github.algorithmes.leetcode.algos.arrays;

import java.util.ArrayList;
import java.util.List;

public class DecompressRunLengthEncodedList {

    public int[] decompressRLElist(int[] nums) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) {
            for (int k = 1; k <= nums[i]; k++) {
                integers.add(nums[i + 1]);
            }
        }
        int[] res = new int[integers.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = integers.get(i);
        }
        return res;
    }
}
