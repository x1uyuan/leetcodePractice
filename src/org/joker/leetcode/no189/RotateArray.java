package org.joker.leetcode.no189;

/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 *
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-07-02 12:30
 */
public class RotateArray {
    /**
     * 执行用时 :118 ms, 在所有 Java 提交中击败了37.69%的用户
     * 内存消耗 :38.7 MB, 在所有 Java 提交中击败了39.56%的用户
     *
     * @param nums
     * @param k
     * @return
     */
    public int[] rotate(int[] nums, int k) {
        int count = nums.length;
        int last;
        for (int i = 0; i < k % count; i++) {
            last = nums[count - 1];
            for (int j = count - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = last;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] inputNums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        RotateArray ra = new RotateArray();
        int[] result = ra.rotate(inputNums, k);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}

