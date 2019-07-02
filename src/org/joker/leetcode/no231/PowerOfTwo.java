package org.joker.leetcode.no231;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-05-11 20:28
 */
public class PowerOfTwo {
    /**
     * 执行用时 : 11 ms, 在Power of Two的Java提交中击败了49.32% 的用户
     * 内存消耗 : 34.4 MB, 在Power of Two的Java提交中击败了11.82% 的用户
     *
     * @param n
     * @return
     */
    public boolean isPowerOfTwo(int n) {
        if (n > 0) {
            String str = Integer.toBinaryString(n);
            int flag = 0;
            for (int i = 0; i < str.length(); i++) {
                flag += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
            return flag == 1;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        int input = -2147483648;
        System.out.println(powerOfTwo.isPowerOfTwo(input));
    }
}

