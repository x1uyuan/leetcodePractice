package org.joker.sort;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-05-17 16:03
 */
public class SelectSort {
    public int[] sort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int index = getMin(a, i);
            if (a[i] > a[index]) {
                int tmp = a[i];
                a[i] = a[index];
                a[index] = tmp;
            }
        }
        return a;
    }

    public int getMin(int[] a, int startIndex) {
        int minIndex = startIndex;
        for (int i = startIndex + 1; i < a.length; i++) {
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        SelectSort selectSort = new SelectSort();
        int[] input = {1,3,6,8,6,2,5,9,5,7};
        int[] output = selectSort.sort(input);
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}

