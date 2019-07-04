package org.joker.leetcode.no53;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-07-04 12:22
 */
public class MaxSubArray {
    /**
     * 执行用时 :2 ms, 在所有 Java 提交中击败了97.99%的用户
     * 内存消耗 :38 MB, 在所有 Java 提交中击败了87.95%的用户
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            res = Math.max(res, sum);
        }
        return res;
    }

    public static void main(String[] args) {
        MaxSubArray msa = new MaxSubArray();
        int[] input = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(msa.maxSubArray(input));
    }
}

