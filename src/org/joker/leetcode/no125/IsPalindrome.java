package org.joker.leetcode.no125;

/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写
 *
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-07-02 14:51
 */
public class IsPalindrome {
    /**
     * 执行用时 :10 ms, 在所有 Java 提交中击败了80.39%的用户
     * 内存消耗 :37.6 MB, 在所有 Java 提交中击败了91.81%的用户
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {
        if ("".equals(s)) return true;
        int start = 0;
        int end = s.length()-1;
        String ss = s.toLowerCase();
        while (start < end) {
            char s1 = ss.charAt(start);
            char s2 = ss.charAt(end);
            if (isNumOrLetter(s1) && isNumOrLetter(s2)) {
                if (s1 != s2) {
                    return false;
                }
                start ++;
                end --;
            } else if (!isNumOrLetter(s1)){
                start ++;
            } else if (!isNumOrLetter(s2)) {
                end --;
            }
        }
        return true;
    }

    public boolean isNumOrLetter(char c) {
        return !((c > 57 && c < 65) || (c > 90 && c < 97) || c > 122 || c < 48) ;
    }

    public static void main(String[] args) {
        IsPalindrome ip = new IsPalindrome();
        String input = "A 1man, a plan, a canal: Panam1a";
        System.out.println(ip.isPalindrome(input));
    }
}

