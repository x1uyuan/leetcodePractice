package org.joker.sort;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-05-17 17:12
 */
public class QuickSort {
    public int[] quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(arr, left, right);
            quickSort(arr, left, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, right);
        }
        return arr;
    }

    private int partition(int[] arr, int left, int right) {
        // 设定基准值（pivot）
        int pivot = left;
        int index = pivot + 1;
        for (int i = index; i <= right; i++) {
            if (arr[i] < arr[pivot]) {
                swap(arr, i, index);
                index++;
            }
        }
        swap(arr, pivot, index - 1);
        return index - 1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        QuickSort qc = new QuickSort();
        int[] input = {1,3,6,8,6,2,5,9,5,7};
        int[] output = qc.quickSort(input,0,input.length-1);
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}

