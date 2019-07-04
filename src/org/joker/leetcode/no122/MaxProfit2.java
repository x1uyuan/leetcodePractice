package org.joker.leetcode.no122;

/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。  设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）
 *
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-07-03 00:12
 */
public class MaxProfit2 {
    /**
     * 执行用时 :2 ms, 在所有 Java 提交中击败了98.77%的用户
     * 内存消耗 :37 MB, 在所有 Java 提交中击败了81.71%的用户
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int count = prices.length;
        int res = 0;
        for (int i = 1; i < count; i++) {
            if (prices[i] > prices[i - 1]) {
                res += (prices[i] - prices[i - 1]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        MaxProfit2 mp2 = new MaxProfit2();
//        int[] input = {7,1,5,3,6,4};
        int[] input = {7,6,4,3,1};
        System.out.println(mp2.maxProfit(input));
    }
}

