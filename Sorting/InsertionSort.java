package com.codingblocks.Sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String args[]) {
        Scanner si =new Scanner(System.in);
        int n = si.nextInt();
        int nums[] =new int[n];
        for (int i = 0; i < nums.length ; i++) {
            nums[i] =si.nextInt();
        }
        insertionSort(nums);
        display(nums);
    }
    public static void insertionSort(int[] nums){
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    swap(nums, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }
    public static void swap(int nums[], int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static void display (int nums[]) {
        for (int i = 0; i < nums.length ; i++) {
            System.out.println(nums[i] + " ");
        }
    }
}
