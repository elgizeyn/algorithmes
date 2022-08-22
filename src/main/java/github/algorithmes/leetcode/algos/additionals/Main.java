package github.algorithmes.leetcode.algos.additionals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        int[] arr = {1, 1, 2, 3};
//        System.out.println(Arrays.toString(decompressRLElist(arr)));
        performanceCheck();
        add123();
    }

    public static void callGC() {
        System.gc();
        Runtime.getRuntime().gc();
    }

    public static void performanceCheck() {

        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Java");
        for (int i = 0; i < 100000; i++)
            sb.append("Tpoint");

        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Java");
        for (int i = 0; i < 100000; i++)
            sb2.append("Tpoint");

        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
    }

    public static int[] decompressRLElist(int[] nums) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) {
            for (int k = 1; k <= nums[i]; k++)
                integers.add(nums[i + 1]);
        }
        int[] res = new int[integers.size()];
        for (int i = 0; i < res.length; i++)
            res[i] = integers.get(i);
        return res;
    }


    public static int factorial(int n) {
        long startTime = System.currentTimeMillis();
        if (n == 0 || n == 1)
            return 1;

        return n * factorial(n - 1);
    }

    public static void mai() {
        System.out.println();
    }

    public static List<Integer> foo(int n) {
        List<Integer> list = new ArrayList<>();
        while (n > 0) {
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0)
                    count++;
            }
            if (count <= 2)
                list.add(n);

            n--;
        }
        return list;
    }

    public static int diagonal(int[][] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i][i];

        return sum;
    }

    public static int reverse(int n) {
        int k = 0;
        while (n > 0) {
            if (n % 10 == 0)
                k *= 10;
            else {
                k *= 10;
                k += n % 10;
            }
            n /= 10;
        }
        return k;
    }

    public static void add123() {
        long startTime = System.currentTimeMillis();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(123);
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis() - startTime);
    }


    public static String pangrams(String s) {
        for (char c : "thequickbrownfoxjumpsoverthelazydog".toCharArray()) {
            if (!(s.toLowerCase().contains(c + "")))
                return "not pangram";
        }
        return "pangram";
    }

}

