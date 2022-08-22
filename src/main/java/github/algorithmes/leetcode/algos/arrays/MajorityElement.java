package github.algorithmes.leetcode.algos.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MajorityElement {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(restoreString("codeleet", arr));
    }


    public static String restoreString(String s, int[] indices) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            for (int k = 0; k < s.length(); k++) {
                if (i == indices[k])
                    builder.append(s.charAt(k));
            }
        }
        return builder.toString();
    }

    // 2, 3, 9, 2  => 29 + 32
    public static int minimumSum(int num) {
        int[] arr = new int[4];
        arr[0] = num % 10;
        num /= 10;
        arr[1] = num % 10;
        num /= 10;
        arr[2] = num % 10;
        num /= 10;
        arr[3] = num % 10;

        int max1 = Integer.MIN_VALUE;
        int max1Index = -1;
        int max2 = Integer.MIN_VALUE;
        int max2Index = -2;
        int min1 = Integer.MAX_VALUE;
        int min1Index = -1;
        int min2 = Integer.MAX_VALUE;
        int min2Index = -2;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1 && arr[i] > max2) {
                if (max1 > max2) {
                    max2 = arr[i];
                    max2Index = i;
                } else {
                    max1 = arr[i];
                    max1Index = i;
                }
            }
            if (arr[i] > max1 && i != max2Index) {
                max1 = arr[i];
                max1Index = i;
            }
            if (arr[i] > max2 && i != max1Index) {
                max2 = arr[i];
                max2Index = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min1 && arr[i] < min2) {
                if (min1 > min2) {
                    min1 = arr[i];
                    min1Index = i;
                } else {
                    min2 = arr[i];
                    min2Index = i;
                }
            }
            if (arr[i] < min2 && i != min1Index) {
                min2 = arr[i];
                min2Index = i;
            }
            if (arr[i] < min1 && i != min2Index) {
                min1 = arr[i];
                min1Index = i;
            }
        }
        return (min1 * 10 + max1) + (min2 * 10 + max2);
    }


    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        if (nums.length == 0)
            return -100;
        for (int i : nums) {
            if (!map.containsKey(i))
                map.put(i, 1);
            else
                map.put(i, map.get(i) + 1);
        }
        for (int i : map.keySet()) {
            if (map.get(i) > nums.length / 2)
                return i;
        }
        return 0;
    }


    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i : candies) {
            if (i > max)
                max = i;
        }
        for (int i = 0; i < candies.length; i++)
            res.add(i, candies[i] + extraCandies >= max);
        return res;
    }


    public static int numberOfSteps(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 2 == 0)
                num /= 2;
            else
                num -= 1;
            count++;
        }
        return count;
    }


    public static int[] buildArray(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int k = nums[i];
            res[i] = nums[k];
        }
        return res;
    }

    // [2,5,1,3,4,7]
    // [2,3,5,4,1,7]
    public static int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++)
            x[i] = nums[i];

        for (int i = 0; i < n; i++)
            y[i] = nums[i + n];

        int xCount = 0;
        int yCount = 0;
        for (int i = 0; i < res.length; i++) {
            if (i % 2 == 0) {
                res[i] = x[xCount];
                xCount++;
            } else {
                res[i] = y[yCount];
                yCount++;
            }
        }
        return res;
    }
}