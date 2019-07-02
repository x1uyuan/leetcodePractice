package org.joker.leetcode.no832;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-05-13 21:51
 */
public class FlipAndInvertImage {
    /**
     * 执行用时 : 4 ms, 在Flipping an Image的Java提交中击败了59.02% 的用户
     * 内存消耗 : 38.1 MB, 在Flipping an Image的Java提交中击败了89.10% 的用户
     *
     * @param A
     * @return
     */
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < Math.ceil(A[i].length / 2); j++) {
                int tmp = A[i][j];
                A[i][j] = A[i][A[i].length - j - 1];
                A[i][A[i].length - j - 1] = tmp;
            }
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = 1 - A[i][j];
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[][] A = {{1,1,0}, {1,0,1}, {0,0,0}};
        FlipAndInvertImage flipAndInvertImage = new FlipAndInvertImage();
        System.out.println(flipAndInvertImage.flipAndInvertImage(A));
    }
}

