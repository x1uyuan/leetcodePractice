package org.joker.leetcode.no977;

import java.util.Arrays;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-05-13 22:49
 */
public class SortedSquares {

    /**
     * 执行用时 : 9 ms, 在Squares of a Sorted Array的Java提交中击败了79.69% 的用户
     * 内存消耗 : 49.2 MB, 在Squares of a Sorted Array的Java提交中击败了79.24% 的用户
     *
     * @param A
     * @return
     */
    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }


    public static void main(String[] args) {
        int[] input = {-4, -1, 0, 3, 10};
        SortedSquares sortedSquares = new SortedSquares();
        int[] output = sortedSquares.sortedSquares(input);
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}

