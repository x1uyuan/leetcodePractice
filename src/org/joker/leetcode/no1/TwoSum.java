package org.joker.leetcode.no1;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-05-09 19:03
 */
public class TwoSum {
    /**
     * Runtime: 18 ms
     * Memory Usage: 38.6 MB
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
            if (arr[0] + arr[1] > 0) {
                break;
            }
        }
        return arr;
    }
}

