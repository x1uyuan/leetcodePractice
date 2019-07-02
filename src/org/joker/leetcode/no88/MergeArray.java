package org.joker.leetcode.no88;

import java.util.Arrays;

/**
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 *
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-07-02 13:22
 */
public class MergeArray {
    /**
     * 执行用时 :1 ms, 在所有 Java 提交中击败了98.17%的用户
     * 内存消耗 :36.4 MB, 在所有 Java 提交中击败了78.21%的用户
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     * @return
     */
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < m+n; i++) {
            nums1[i] = nums2[i-m];
        }
        Arrays.sort(nums1,0,m+n);
        return nums1;
    }

    public static void main(String[] args) {
        MergeArray ma = new MergeArray();
        int[] nums1 = {1,2,3,0,0,0,0};
        int[] nums2 = {2,5,6};
        int[] res = ma.merge(nums1,1,nums2,1);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}

