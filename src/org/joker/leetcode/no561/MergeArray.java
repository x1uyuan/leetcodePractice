package org.joker.leetcode.no561;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-05-13 00:35
 */
public class MergeArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int flag1 = 0;
        int flag2 = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (n == 0) {

            } else if (i == m + flag2) {
                nums1[i] = nums2[flag2];
                flag2++;
            } else if (nums1[flag1] <= nums2[flag2]) {
                nums1[i] = nums1[flag1];
                flag1++;
            } else {
                for (int j = m + n - 1; j > i; j--) {
                    nums1[j] = nums1[j - 1];
                }
                nums1[i] = nums2[flag2];
                flag2++;
                flag1++;
            }
        }

    }

    public static void main(String[] args) {
        int[] nums1 = {2,0};
        int[] nums2 = {1};
        MergeArray mergeArray = new MergeArray();
        mergeArray.merge(nums1, 1, nums2, 1);
        for (int i = 0; i <nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }
}

