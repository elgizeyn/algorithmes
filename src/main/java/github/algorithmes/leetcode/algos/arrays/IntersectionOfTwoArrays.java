package github.algorithmes.leetcode.algos.arrays;

import java.util.HashMap;
import java.util.HashSet;

public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i : nums1) {
            if (!map1.containsKey(i))
                map1.put(i, 1);
            else
                map1.put(i, map1.get(i) + 1);
        }
        for (int i : nums2) {
            if (!map2.containsKey(i))
                map2.put(i, 1);
            else
                map2.put(i, map2.get(i) + 1);
        }
        for (int i : nums1) {
            if (map1.containsKey(i) && map2.containsKey(i)) {
                set.add(i);
            }
        }
        int[] r = new int[set.size()];
        int j = 0;
        for (int i : set) {
            r[j] = i;
            j++;
        }
        return r;
    }
}
