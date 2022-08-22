package github.algorithmes.leetcode.algos.additionals;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {


    public static void main(String[] args) {
        int[] arr = {3, 60, 35, 2, 45, 320, 5};
        List<Integer> list = new ArrayList<>();
        for (int l : arr) {
            list.add(l);
        }
        System.out.println(list);
        System.out.println("--------------------------");
        bubbleSort(arr);
    }


    static void bubbleSort(int[] arr) {
        int n = arr.length; // 7
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
            List<Integer> list = new ArrayList<>();

            for (int l : arr)
                list.add(l);

            System.out.println(list);
        }
    }


}