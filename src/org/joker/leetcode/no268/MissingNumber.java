package org.joker.leetcode.no268;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 *
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-07-03 00:21
 */
public class MissingNumber {
    /**
     * 执行用时 :21 ms, 在所有 Java 提交中击败了8.15%的用户
     * 内存消耗 :50.7 MB, 在所有 Java 提交中击败了11.14%的用户
     * @param nums
     * @return
     */
    public int missingNumber1(int[] nums) {
        int res = 0;
        int count = nums.length;
        Map<Integer, Integer> map = new HashMap<>(count);
        for (int i = 0; i < count; i++) {
            map.put(nums[i], 1);
        }
        for (int i = 0; i < count + 1; i++) {
            if (!map.keySet().contains(i)) {
                res = i;
            }
        }
        return res;
    }

    /**
     * 执行用时 :2 ms, 在所有 Java 提交中击败了94.64%的用户
     * 内存消耗 :38.8 MB, 在所有 Java 提交中击败了98.01%的用户
     *
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
        int res = 0;
        int[] tmp = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            tmp[nums[i]] = 1;
        }
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] != 1) {
                res = i;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        MissingNumber mn = new MissingNumber();
        int[] input = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(mn.missingNumber1(input));
    }
}

