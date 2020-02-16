package com.codingblocks.Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main (String args[]) {
        Scanner si = new Scanner(System.in);
        int n = si.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < nums.length ; i++) {
            nums[i] = si.nextInt();
        }
        selectionSort(nums);
        display(nums);
    }
    public static void selectionSort(int nums[]) {
        for (int i = 0; i < nums.length ; i++) {
            int m = maxIndex(nums, 0, nums.length -1 - i);
            swap(nums, m, nums.length - i -1);
        }
    }
    public static int maxIndex(int nums[], int start, int end) {
        int max = start;
        for (int i = 0; i <= end; i++) {
            if(nums[i] > nums[max]) {
                 max = i;
            }
        }
        return  max;
    }
    public static void swap(int nums[], int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = nums[second];
    }
    public static void  display(int nums[]) {
        for (int i = 0; i < nums.length ; i++) {
            System.out.print(nums[i]+ " ");
        }
    }
}
