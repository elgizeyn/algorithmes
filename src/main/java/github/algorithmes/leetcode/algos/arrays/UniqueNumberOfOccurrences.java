package github.algorithmes.leetcode.algos.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueNumberOfOccurrences {

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (!map.containsKey(i))
                map.put(i, 1);
            else
                map.put(i, map.get(i) + 1);
        }
        for (int i : map.keySet()) {
            if (set.add(map.get(i))) {

            } else return false;

        }
        return true;
    }
}