package org.joker.leetcode.no70;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-05-13 00:09
 */
public class ClimbStairs {
    /**
     * 执行用时 : 0 ms, 在Climbing Stairs的Java提交中击败了100.00% 的用户
     * 内存消耗 : 33.1 MB, 在Climbing Stairs的Java提交中击败了70.87% 的用户
     *
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        // 4秒 leetcode超时
//        if (n <= 1) {
//            return 1;
//        } else {
//            return climbStairs(n-1) + climbStairs(n-2);
//        }
        // 动态数组
        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];

    }

    public static void main(String[] args) {
        ClimbStairs cs = new ClimbStairs();
        int input = 44;
        System.out.println(cs.climbStairs(input));
    }
}

