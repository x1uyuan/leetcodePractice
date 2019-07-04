package org.joker.leetcode.no204;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-06-14 10:54
 */
public class CountPrimes {
    /**
     * 执行用时 :65 ms, 在所有 Java 提交中击败了18.39%的用户
     * 内存消耗 :34.3 MB, 在所有 Java 提交中击败了80.35%的用户
     * @param n
     * @return
     */
    public int countPrimes(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }
        int res = 0;
        boolean[] notPrime = new boolean[n + 1];
        notPrime[0] = true;
        notPrime[1] = true;
        for (int i = 2; i < n + 1; i++) {
            int tmp = 2;
            while (i * tmp < n + 1) {
                notPrime[i * tmp] = true;
                tmp++;
            }
        }
        for (int i = 0; i < n + 1; i++) {
            if (!notPrime[i]) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        CountPrimes cp = new CountPrimes();
        int input = 100;
        System.out.println(cp.countPrimes(input));
    }
}

