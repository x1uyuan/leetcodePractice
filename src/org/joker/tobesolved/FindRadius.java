package org.joker.tobesolved;

import java.util.Arrays;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-06-12 12:53
 */
public class FindRadius {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        int tmp = Math.max(heaters[0] - 1, houses.length - heaters[heaters.length - 1]);
        if (heaters.length == 1) {
            return tmp;
        }
        int max = 0;
        Arrays.sort(heaters);
        for (int i = 0; i < heaters.length - 1; i++) {
            if (heaters[i+1]- heaters[i] > max) {
                max = heaters[i+1]- heaters[i];
            }
        }
        return Math.max(tmp, max/2);
    }

    public static void main(String[] args) {
        FindRadius fr = new FindRadius();
        int[] input1 = {1,2,3,4};
        int[] input2 = {1,4};
        System.out.println(fr.findRadius(input1,input2));
    }
}

