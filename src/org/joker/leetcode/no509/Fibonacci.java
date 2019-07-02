package org.joker.leetcode.no509;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-05-10 16:43
 */
public class Fibonacci {
    /**
     * Runtime: 9 ms
     * Memory Usage: 32.2 MB
     *
     * @param N
     * @return
     */
    public int fib(int N) {
        int fib0 = 0;
        int fib1 = 1;
        if (0 == N) {
            return fib0;
        } else if (1 == N) {
            return fib1;
        } else {
            return fib(N - 1) + fib(N - 2);
        }
    }

    /**
     * 执行用时 : 0 ms, 在Fibonacci Number的Java提交中击败了100.00% 的用户
     * 内存消耗 : 32.7 MB, 在Fibonacci Number的Java提交中击败了75.38% 的用户
     *
     * @param N
     * @return
     */
    public int fib1(int N) {
        int[] arr = new int[N + 1];
        if (N == 0) {
            return 0;
        } else if (N == 1) {
            return 1;
        } else {
            arr[0] = 0;
            arr[1] = 1;
            for (int i = 2; i < arr.length; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            return arr[N];
        }
    }
}

