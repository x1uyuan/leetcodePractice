package org.joker.leetcode.no217;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-05-13 00:02
 */
public class ContainsDuplicate {
    /**
     * 执行用时：403 ms
     *
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        ContainsDuplicate cd = new ContainsDuplicate();
        int[] input = {1, 2, 3};
        System.out.println(cd.containsDuplicate(input));
    }
}

