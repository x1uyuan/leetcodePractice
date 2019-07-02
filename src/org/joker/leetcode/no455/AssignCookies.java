package org.joker.leetcode.no455;

import java.util.Arrays;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-05-16 00:31
 */
public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        int result = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        if (g.length == 0) {
            return result;
        } else {
            for (int j =0; j < s.length; j++) {
                for (int i = result; i< g.length; i++) {
                    if (s[j] >= g[i]) {
                        result++;
                        break;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        AssignCookies ac = new AssignCookies();
        int[] i1 = {1,2,3};
        int[] i2 = {3};
        System.out.println(ac.findContentChildren(i1,i2));
    }
}

