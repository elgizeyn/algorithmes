package github.algorithmes.leetcode.algos.additionals;

import java.util.Arrays;
import java.util.List;

public class ArrTasks {
    public static void main(String[] args) {
        int[] arr = {1, 5, 26};
        int[] arr1 = getConcatenation(arr);
//        for (int i : arr1) {
//            System.out.println(i);
//        }
//        main1(arr);
//        main2(arr);
//        List<Integer> list = new ArrayList<>();
//        list.add(3);
//        list.add(10);
//        list.add(2);
//        list.add(9);
//        bonAppetit(list, 1, 12);
//
//        String[] operations = {"--X", "X++", "X++"};
//
//        System.out.println(finalValueAfterOperations(operations));

        System.out.println(")))))))))))))))))))");
        System.out.println(minimumSum(2932));


    }

    public static void main1(int[] arr) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i < min1) {
                min2 = min1; // min2 = 5  ||  min1 = 1
                min1 = i;
            } else if (i < min2 && min1 != i)
                min2 = i;
        }
        System.out.println(min1 + " " + min2);

    }

    public static void main2(int[] arr) {
        int min1 = arr[0];
        int min2 = arr[1];

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < min1 && arr[i] < min2) {
                if (min1 < min2)
                    min2 = i;
                else
                    min1 = i;
                break;
            }
            if (arr[i] < min2)
                min2 = arr[i];
            if (arr[i] < min1)
                min1 = arr[i];

        }
        System.out.println(min1 + " " + min2);
    }

    //    4 1
//            3 10 2 9
//            12
//    return : 5
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int fair = 0;
        for (int i = 0; i < bill.size(); i++) {
            if (i != k)
                fair += bill.get(i);
        }
        if (fair / 2 - b == 0)
            System.out.println("Bon Appetit");
        else System.out.println(Math.abs(fair / 2 - b));
    }

//    Given an integer array nums of length n,
//    you want to create an array ans of length 2n
//    where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
//    Specifically, ans is the concatenation of two nums arrays.
//    Return the array ans.


    public static int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        for (int i = 0; i < result.length; i++) {
            int n = i % nums.length;
            result[i] = nums[n];
        }
        return result;
    }

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String s : operations) {
            if (s.contains("+"))
                x++;
            else x--;
        }
        return x;
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) sum += i;
            if (sum > max)
                max = sum;
        }
        return max;
    }

    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String s : sentences) {
            String[] res = s.split(" ");
            if (res.length > max)
                max = res.length;
        }
        return max;
    }

    // 2932
    public static int minimumSum(int num) {
        int[] arr = new int[4];
        arr[0] = num % 10;
        num /= 10;
        arr[1] = num % 10;
        num /= 10;
        arr[2] = num % 10;
        num /= 10;
        arr[3] = num % 10;


        int min1 = arr[0] * 10 + arr[1];
        int min2 = arr[0] * 10 + arr[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int k = Integer.MAX_VALUE;
                if (i != j) {
                    k = arr[i] * 10 + arr[j];
                }
                if (k < min1 && k < min2) {
                    if (min1 > min2)
                        min1 = k;
                    if (min2 > min1)
                        min2 = k;
                    break;
                }
                if (k < min1 && k != min2)
                    min1 = k;
                if (k < min2 && k != min1)
                    min2 = k;
            }
        }
        System.out.println(min1 + " " + min2);
        return min1 + min2;
    }

    public static String pangrams(String s) {
        String s1 = s.toLowerCase();
        char[] all = "thequickbrownfoxjumpsoverthelazydog".toCharArray();
//        for (char c : all) {
//            if (!s1.contains(all))
//                return "This string lacks an " + c;
//        }
        if (!(s1.contains(Arrays.toString(all))))
            return "a";
        return "pangram";
    }


}
