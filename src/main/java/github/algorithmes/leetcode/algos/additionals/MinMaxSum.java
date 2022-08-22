package github.algorithmes.leetcode.algos.additionals;

import java.util.ArrayList;
import java.util.List;

public class MinMaxSum {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(9);
        // 1,2 1,2    3,6    1,2  1,2
        miniMaxSum1(list);
    }

    public static void miniMaxSum1(List<Integer> arr) {
        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.size(); i++) {
            long sum = 0;
            for (int j = 0; j < arr.size(); j++) {
                if (i != j)
                    sum += arr.get(j);
            }
            if (sum > max) max = sum;
            if (sum < min) min = sum;
        }
        System.out.println(min + " " + max);
    }
}