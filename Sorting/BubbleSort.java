package com.codingblocks.Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String args[]) {
        Scanner si = new Scanner(System.in);
        int n = si.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n ; i++) {
            nums[i] = si.nextInt();
        }
        bubbleSort(nums);
        display(nums);
    }
    public static void bubbleSort ( int nums []) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 -  i; j++) {
                if(nums[j] > nums[j+1]){
                   swap(nums, j, j+1);
                }
            }
        }
    }
    public static void swap (int nums[] , int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static void display (int nums[]) {
        for (int i = 0; i < nums.length ; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
