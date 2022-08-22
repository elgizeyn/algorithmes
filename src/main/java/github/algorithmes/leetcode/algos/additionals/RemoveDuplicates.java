package github.algorithmes.leetcode.algos.additionals;

import java.util.ArrayList;
import java.util.List;


public class RemoveDuplicates {

    public static void main(String[] args) {
    }

    // 2,1,4,3,9,6               2 sorted
    // 2,3,1,3,2,4,6,7,9,2,19    1
    // 2,2,2,1,4,3,3,9,6,7,19    result

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int count = 0;
        List<Integer> list = new ArrayList<>();
        List<Integer> missed = new ArrayList<>();
        int[] res = new int[arr1.length];
        for (int i : arr2)
            list.add(i);

        for (int i : arr2) {
            if (!list.contains(i))
                missed.add(i);

        }
        for (int item : arr2) {
            for (int value : arr1) {
                if (item == value) {
                    res[count] = item;
                    count++;
                }
            }
        }
        return res;
    }
}
