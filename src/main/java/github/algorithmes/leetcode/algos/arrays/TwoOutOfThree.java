package github.algorithmes.leetcode.algos.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoOutOfThree {
    public List<Integer> twoOutOfThree1(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        for (int i : nums1) {
            list1.add(i);
        }
        for (int i : nums2) {
            list2.add(i);
        }
        for (int i : nums3) {
            list3.add(i);
        }
        for (int i : nums1) {
            if (list2.contains(i) || list3.contains(i))
                set.add(i);
        }
        for (int i : nums2) {
            if (list3.contains(i) && !(list1.contains(i)))
                set.add(i);
        }
        return new ArrayList<>(set);
    }
}
