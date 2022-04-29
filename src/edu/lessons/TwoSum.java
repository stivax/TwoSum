package edu.lessons;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = {7, 2, 3, 6, 2, 4, 9};
        int target = 8;

        System.out.println(Arrays.toString(twoSum(nums, target)));

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    res = new int[]{i, j};
                }

            }
        }
        return res;
    }

}
