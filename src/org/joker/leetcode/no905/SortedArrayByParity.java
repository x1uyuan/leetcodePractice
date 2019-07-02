package org.joker.leetcode.no905;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-05-13 23:19
 */
public class SortedArrayByParity {
    /**
     * 执行用时 : 4 ms, 在Sort Array By Parity的Java提交中击败了72.08% 的用户
     * 内存消耗 : 44.2 MB, 在Sort Array By Parity的Java提交中击败了76.46% 的用户
     *
     * @param A
     * @return
     */
    public int[] sortArrayByParity(int[] A) {
        int i = 0;
        int j = A.length;
        while (i < j) {
            if (A[i] % 2 == 0 && A[j] % 2 == 1) {
                i++;
                j--;
            } else if (A[i] % 2 == 0 && A[j] % 2 == 0) {
                i++;
            } else if (A[i] % 2 == 1 && A[j] % 2 == 1) {
                j--;
            } else {
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }
        }
        return A;
    }
}

