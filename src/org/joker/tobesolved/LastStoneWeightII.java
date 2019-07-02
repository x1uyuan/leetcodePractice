package org.joker.tobesolved;

import java.util.Arrays;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-06-12 13:53
 */
public class LastStoneWeightII {
    public int lastStoneWeightII(int[] stones) {
        if (stones.length == 1) {
            return stones[0];
        }
        Arrays.sort(stones);
        int weight = 0;
        for (int i = 0; i < stones.length - 1; i++) {
            if (stones[i] == 0) {
                continue;
            }
            int tmp = stones[i];
            for (int j = i; j < stones.length; j++) {
                stones[j] -= tmp;
            }
        }
        for (int i = 0; i < stones.length; i++) {
            System.out.println(stones[i]);
        }
        for (int i = 0; i < stones.length; i++) {
            weight += stones[i];
        }
        return weight > 1 ? weight : stones.length % 2 != 0 ? 0 : 1;
    }

    public static void main(String[] args) {
        LastStoneWeightII lsw = new LastStoneWeightII();
        int[] input = {1,1,2,3,5,8,13,21,34,55,89,14,23,37,61,98};
        System.out.println(lsw.lastStoneWeightII(input));
    }
}

