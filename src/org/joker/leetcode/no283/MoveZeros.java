package org.joker.leetcode.no283;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-07-02 23:49
 */
public class MoveZeros {
    /**
     * 执行用时 :84 ms, 在所有 Java 提交中击败了5.05%的用户
     * 内存消耗 :40.8 MB, 在所有 Java 提交中击败了49.34%的用户
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        int size = nums.length;
        for (int i = 0; i < size-1; i++) {
            for (int j = size - 2; j >= 0  ; j--) {
                if (nums[j] == 0) {
                    nums[j] = nums[j+1];
                    nums[j+1] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] input = {0, 0, 1};
        MoveZeros mz = new MoveZeros();
        mz.moveZeroes(input);
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
    }
}

