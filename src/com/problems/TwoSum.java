package com.problems;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    static int[] findTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] {nums[target - nums[i]],i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findTwoSum(new int[]{3, 2, 4}, 6)));
    }
}
