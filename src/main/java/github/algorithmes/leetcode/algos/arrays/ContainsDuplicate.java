package github.algorithmes.leetcode.algos.arrays;

import java.util.HashMap;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean duplicate = false;
        for (int c : nums) {
            if (!map.containsKey(c))
                map.put(c, 1);
            else
                map.put(c, map.get(c) + 1);
        }
        for (int i : map.keySet()) {
            if (map.get(i) >= 2) {
                return true;
            }
        }
        return false;
    }
}