package github.algorithmes.leetcode.algos.additionals;

import lombok.var;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

//        System.out.println(reverseS("helloasf"));
//        int[] arr = {5, 4, 3, 2, 1};
//        int res = maxProductDifference(arr);
//        List<Integer> brr = new ArrayList<>();
//        brr.add(10);
//        brr.add(7);
//        brr.add(4);
//        brr.add(7);
//        brr.add(10);
//        brr.add(1);

        List<Integer> integers = new ArrayList<>();
        integers.add(7);
        integers.add(10);
        integers.add(8);
        integers.add(12);
        integers.add(21);

        List<Integer> greaterThanTwo = integers.stream()
                .filter(f -> f > 2)
                .collect(Collectors.toList());


        List<Integer> multiplyByTwo = integers.stream()
                .map(i -> i * 2)
                .collect(Collectors.toList());
        multiplyByTwo.forEach(System.out::println);

        List<Integer> evenNumbers = integers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        evenNumbers.forEach(System.out::println);
        List<String> stringList = integers.stream().map(Object::toString).collect(Collectors.toList());

        long count = stringList.stream().count();
        long c = stringList.size();

        int string = 41;
        System.out.println();
    }


    public static String reverseS(String s) {
        return s.substring(1) + s.charAt(0);
    }

    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += nums[j];
            }
            res[i] = sum;
        }
        return res;
    }

    public static int maxProductDifference(int[] nums) {
        // 1 2 3 4 5
        int max1 = nums[0]; // 1
        int max1Index = 0;
        int max2 = nums[1]; // 2
        int max2Index = 1;
        int min1 = nums[0]; // 3
        int min1Index = 0;
        int min2 = nums[1]; // 4
        int min2Index = 1;

        for (int num = 0; num < nums.length; num++) {
            if (nums[num] < min1 && nums[num] < min2) {
                if (min1 > min2) {
                    min1 = nums[num];
                    min1Index = num;
                } else {
                    min2 = nums[num];
                    min2Index = num;
                }
            }
            if (min1 > nums[num] && min2Index != num) {
                min1 = nums[num];
                min1Index = num;
            }
            if (min2 > nums[num] && min1Index != num) {
                min2 = nums[num];
                min2Index = num;
            }
        }

        for (int num = 0; num < nums.length; num++) {
            if (nums[num] > max1 && nums[num] > max2) {
                if (max1 > max2) {
                    max2 = nums[num];
                    max2Index = num;
                } else {
                    max1 = nums[num];
                    max1Index = num;
                }
            }
            if (max1 < nums[num] && max2Index != num) {
                max1 = nums[num];
                max1Index = num;
            }
            if (max2 < nums[num] && max1Index != num) {
                max2 = nums[num];
                max2Index = num;
            }
        }
        return max1 * max2 - min1 * min2;
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        Set<Integer> odds = new HashSet<>();
        for (int i = 1; i <= arr.length; i++) {
            if (i % 2 == 1)
                odds.add(i - 1);
        }
        // 1, 3, 5 -> {0, 2, 4}
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int odd : odds) {
                if (i + odd < arr.length) {
                    for (int k = i; k <= i + odd; k++)
                        sum += arr[k];
                }
            }
        }
        return sum;
    }


    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        for (var word : word1)
            builder1.append(word);
        for (var word : word2)
            builder2.append(word);
        return builder1.toString().equals(builder2.toString());
    }

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        for (int i = 0; i < brr.size(); i++) {
            for (int j = 1; j < brr.size() - i; j++) {
                if (brr.get(j - 1) > brr.get(j)) {
                    int temp = brr.get(j - 1);
                    brr.set(j - 1, brr.get(j));
                    brr.set(j, temp);
                }
            }
        }
        HashMap<Integer, Integer> brrMap = new HashMap<>();
        HashMap<Integer, Integer> arrMap = new HashMap<>();
        HashMap<Integer, Integer> res = new HashMap<>();
        for (Integer integer : brr) {
            if (!(brrMap.containsKey(integer)))
                brrMap.put(integer, 1);
            else
                brrMap.put(integer, brrMap.get(integer) + 1);
        }


        for (Integer integer : arr) {
            if (!(arrMap.containsKey(integer)))
                arrMap.put(integer, 1);
            else
                arrMap.put(integer, arrMap.get(integer) + 1);
        }

        for (int key : brrMap.keySet()) {
            if (arrMap.containsKey(key)) {
                if (brrMap.get(key) - arrMap.get(key) != 0)
                    res.put(key, brrMap.get(key) - arrMap.get(key));
            } else
                res.put(key, brrMap.get(key));
        }

        return new ArrayList<>(res.keySet());
    }


    private static int binarySearch(int[] arr, int i) {
        bubbleSort(arr);
        int first = 0;
        int last = arr[arr.length - 1];
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] == i)
                return mid;
            else if (arr[mid] > i)
                last = mid - 1;
            else
                first = mid + 1;
            mid = (last + first) / 2;
        }
        return -1;
    }


    private static void bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static int alternatingCharacters(String s) {
        char[] arr = s.toCharArray();
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i])
                count++;
        }
        return count;
    }


    public static int introTutorial(int V, List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equals(V))
                return i;
        }
        return -1;
    }

    public static void miniMaxSum(List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 1; j < arr.size() - i; j++) {
                if (arr.get(j - 1) > arr.get(j)) {
                    int temp = arr.get(j - 1);
                    arr.set(j - 1, arr.get(j));
                    arr.set(j, arr.get(temp));
                }
            }
        }
        long max = 0;
        long min = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i != 0)
                max += arr.get(i);
            if (i != arr.size() - 1)
                min += arr.get(i);
        }

        System.out.println(min + " " + max);

    }

}

