package org.joker.sort;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-05-17 16:38
 */
public class InsertIonSort {
    public int[] sort(int[] a){
        int n = a.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 ; j--) {
                if (a[j] < a[j-1]){
                    int tmp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = tmp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        InsertIonSort insertIonSort = new InsertIonSort();
        int[] input = {1,3,6,8,6,2,5,9,5,7};
        int[] output = insertIonSort.sort(input);
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}

