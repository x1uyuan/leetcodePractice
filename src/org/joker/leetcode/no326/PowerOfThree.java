package org.joker.leetcode.no326;

/**
 * @author wivtp
 * @description 给定一个整数，写一个函数来判断它是否是 3 的幂次方。
 * @versin 1.0.0
 * @since 2019-07-04
 */
public class PowerOfThree {
    /**
     * 执行用时 :77 ms, 在所有 Java 提交中击败了97.99%的用户
     * 内存消耗 :35.7 MB, 在所有 Java 提交中击败了86.57%的用户
     * @param n
     * @return
     */
    public boolean isPowerOfThree(int n) {
        if (n == 0) return false;
        double tmp =  Math.log(n)/Math.log(3);
        return Math.abs(Math.round(tmp) - tmp) < 0.0000000001 ;
    }

    public static void main(String[] args) {
        PowerOfThree pot = new PowerOfThree();
        int input = 1162261468;
        System.out.println(pot.isPowerOfThree(input));
    }
}

