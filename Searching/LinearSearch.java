package com.codingblocks.Searching;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String args[]) {
        Scanner si = new Scanner(System.in);
        int n = si.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n ; i++) {
            nums[i] = si.nextInt();
        }
        int target = si.nextInt();
        System.out.println(linearSearch(nums, target));
    }
    public static int linearSearch(int nums[], int target) {
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
