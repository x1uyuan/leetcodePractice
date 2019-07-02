package org.joker.sort;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-05-17 15:48
 */
public class BubbleSort {
    public int[] sort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = n-1; j > i; j--) {
                if (a[j-1] > a[j]) {
                    int tmp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = tmp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = {1,3,6,8,6,2,5,9,5,7};
        int[] output = bubbleSort.sort(input);
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}

