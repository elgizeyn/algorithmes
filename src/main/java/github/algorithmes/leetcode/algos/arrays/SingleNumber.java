package github.algorithmes.leetcode.algos.arrays;

import java.util.HashMap;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        if (nums.length == 1)
            return nums[0];
        for (int i : nums) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.remove(i);
            }
        }
        for (int i : map.keySet()) {
            return i;
        }
        return 0;
    }
}
