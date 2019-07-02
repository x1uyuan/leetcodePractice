package org.joker.tobesolved;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-05-14 18:49
 */
public class YoungTriangle {
    public int[][] generate(int numRows) {
        int[][] arr = new int[numRows][numRows];
        if (numRows == 0) {
            return arr;
        } else {
            arr[0][0] = 1;
        }
        for (int i = 1; i < numRows; i++) {
            arr[i][0] = 1;
            arr[1][numRows - 1] = 1;
            int j = 1;
            while (j > 0 && j < numRows - 1) {
                arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                j++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        YoungTriangle yt = new YoungTriangle();
        int[][] output = yt.generate(5);
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(output[i][j]);
                System.out.print("\n");
            }
            System.out.println();
        }
    }
}

