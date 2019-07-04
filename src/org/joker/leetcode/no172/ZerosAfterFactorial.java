package org.joker.leetcode.no172;

/**
 * @author wivtp
 * @description 给定一个整数 n，返回 n! 结果尾数中零的数量。
 * @versin 1.0.0
 * @since 2019-07-04
 */
public class ZerosAfterFactorial {
    /**
     * 执行用时 :2 ms, 在所有 Java 提交中击败了98.71%的用户
     * 内存消耗 :33.2 MB, 在所有 Java 提交中击败了79.86%
     * 的用户
     *
     * @param n
     * @return
     */
    public int trailingZeroes(int n) {
        int res = 0;
        while (n >= 5) {
            res += n / 5;
            n = n / 5;
        }
        return res;
    }
}

