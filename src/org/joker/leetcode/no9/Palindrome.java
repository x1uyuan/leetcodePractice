package org.joker.leetcode.no9;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-05-11 19:53
 */
public class Palindrome {
    /**
     * 执行用时：403 ms
     *
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        String tmp = String.valueOf(x);
        for (int i = 0; i < Math.floor(tmp.length() / 2); i++) {
            if (tmp.charAt(i) != tmp.charAt(tmp.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        int input = 123454321;
        System.out.println(palindrome.isPalindrome(input));
    }
}

