package org.joker.leetcode.no26;

/**
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-07-02 13:00
 */
public class RemoveArrayDuplicates {
    /**
     * 执行用时 :2 ms, 在所有 Java 提交中击败了96.94%的用户
     * 内存消耗 :44.8 MB, 在所有 Java 提交中击败了70.79%的用户
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        RemoveArrayDuplicates rad = new RemoveArrayDuplicates();
        int[] input = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(rad.removeDuplicates(input));
    }
}

