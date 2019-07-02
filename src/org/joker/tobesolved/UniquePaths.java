package org.joker.tobesolved;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-06-06 15:33
 */
public class UniquePaths {
    public long uniquePaths1(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }
        int len = Math.min(m, n);
        long ret = 1;
        for (int i = 0; i < len - 1; i++) {

            ret *= (m + n - 2 - i);
            ret /= i + 1;
        }
        return ret;
    }

    public int uniquePaths(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }
        return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
    }

    public static void main(String[] args) {
        UniquePaths up = new UniquePaths();
        int a = Integer.MAX_VALUE;
        long b = Long.MAX_VALUE;

        System.out.println("result:" + up.uniquePaths1(50, 50));
        //System.out.println("result:" + up.uniquePaths(51, 80));
    }
}

