package org.joker.leetcode.no121;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-05-11 20:02
 */
public class MaxProfit {
    /**
     * 执行用时：146 ms
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int[] max = new int[prices.length];
        int[] diff = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            max[i] = this.findMaxInArray(prices, i);
            diff[i] = max[i] - prices[i];
        }
        int result = this.findMaxInArray(diff, 0);
        if (result < 0) {
            result = 0;
        }
        return result;
    }

    int findMaxInArray(int[] arr, int i) {
        int max = arr[i];
        if (i < arr.length - 1) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        MaxProfit maxProfit = new MaxProfit();
        int[] input = {7, 1, 5, 3, 6, 4, 11, 5, 8, 0};
        System.out.println(maxProfit.maxProfit(input));
    }
}

