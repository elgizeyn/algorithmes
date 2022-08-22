package github.algorithmes.leetcode.algos.arrays;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber {

    public static void main(String[] args) {
        System.out.println(reverseString("Hello"));
    }

    public static int missingNumber(int[] nums) {

        List<Integer> list = new ArrayList<>();

        for (int num : nums) list.add(num);

        for (int i = 0; i <= nums.length; i++) {
            if (!list.contains(i))
                return i;
        }
        return 0;
    }

    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        return 1;
    }


    public static String reverseString(String s) {
        if (s.isEmpty())
            return s;
        return reverseString(s.substring(1)) + s.charAt(0);
    }
}