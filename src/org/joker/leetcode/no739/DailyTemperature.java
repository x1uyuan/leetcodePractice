package org.joker.leetcode.no739;

import java.util.ArrayList;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-05-10 16:55
 */
public class DailyTemperature {
    /**
     * 执行用时：522 ms
     *
     * @param T
     * @return
     */
    public int[] dailyTemperatures(int[] T) {
        ArrayList<Integer> tmp = new ArrayList<>();
        int size = 0;
        for (int i = 0; i < T.length - 1; i++) {
            for (int j = i + 1; j < T.length; j++) {
                if (T[j] > T[i]) {
                    tmp.add(j - i);
                    size++;
                    break;
                }
            }
            if (size < i + 1) {
                tmp.add(0);
                size++;
            }
        }
        tmp.add(0);
        size++;
        int[] result = new int[tmp.size()];
        for (int i = 0; i < tmp.size(); i++) {
            result[i] = tmp.get(i);
        }
        return result;
    }
}
