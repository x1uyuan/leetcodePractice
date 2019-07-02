package org.joker.leetcode.no461;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-05-09 18:26
 */
public class HammingDistance {
    /**
     * Runtime: 1 ms
     * Memory Usage: 32.2 MB
     *
     * @param x
     * @param y
     * @return
     */
    public int hammingDistance(int x, int y) {
        int result = 0;
        String str = Integer.toBinaryString(x ^ y);
        for (int i = 0; i < str.length(); i++) {
            if ('1' == str.charAt(i)) {
                result++;
            }
        }
        return result;
    }

}

