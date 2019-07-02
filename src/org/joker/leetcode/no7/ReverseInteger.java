package org.joker.leetcode.no7;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-05-11 00:03
 */
public class ReverseInteger {

    /**
     * Runtime: 1 ms, faster than 100.00% of Java online submissions for Reverse Integer.
     * Memory Usage: 32.5 MB, less than 100.00% of Java online submissions for Reverse Integer.
     *
     * @param x
     * @return
     */
    public int reverse(int x) {
        long tmp = x;
        long result = 0;
        while (Math.abs(tmp) >= 10) {
            result = result * 10 + tmp % 10;
            tmp = tmp / 10;
        }
        result = result * 10 + tmp % 10;
        if (result > Math.pow(2, 31) - 1 || result < -Math.pow(2, 31)) {
            result = 0;
        }
        return (int) result;
    }

    public static void main(String[] args) {
        ReverseInteger ri = new ReverseInteger();
        int input = 646324351;
        System.out.println(ri.reverse(input));
    }
}

