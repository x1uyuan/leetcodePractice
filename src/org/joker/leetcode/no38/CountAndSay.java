package org.joker.leetcode.no38;

/**
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
 *
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-07-02 14:08
 */
public class CountAndSay {
    /**
     * 执行用时 :43 ms, 在所有 Java 提交中击败了8.23%的用户
     * 内存消耗 :64.9 MB, 在所有 Java 提交中击败了16.71%的用户
     * @param n
     * @return
     */
    public String countAndSay(int n) {
        String[] s = new String[n];
        s[0] = "1";
        for (int i = 1; i < n; i++) {
            s[i] = "";
            if (s[i - 1].length() == 1) {
                s[i] = 1 + s[i - 1];
            } else {
                int count = 1;
                for (int j = 1; j <= s[i - 1].length()-1; j++) {
                    if (s[i-1].charAt(j) == s[i-1].charAt(j-1)){
                        count ++;
                        continue;
                    }
                    if (s[i-1].charAt(j) != s[i-1].charAt(j-1)){
                        s[i] = s[i] + count + s[i-1].charAt(j-1);
                        count = 1 ;
                    }
                }
                s[i] = s[i] + count + s[i-1].charAt(s[i-1].length()-1);
            }

        }
        return s[n-1];
    }


    public static void main(String[] args) {
        CountAndSay cas = new CountAndSay();
        System.out.println(cas.countAndSay(5));
    }
}

