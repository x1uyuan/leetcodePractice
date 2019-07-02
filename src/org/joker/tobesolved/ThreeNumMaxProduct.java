package org.joker.tobesolved;

import java.util.Arrays;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-05-27 19:04
 */
public class ThreeNumMaxProduct {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int positiveNum = 0;
        int negativeNum = 0;
        int zeroNum = 0;
        int N = nums.length;
        int minPos = 0;
        int maxNeg = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                positiveNum++;
            } else if (nums[i] < 0) {
                negativeNum++;
            } else {
                zeroNum++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] < 0) {
                maxNeg = j;
            }
            if (nums[j] > 0) {
                minPos = j;
                break;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        ThreeNumMaxProduct tnmp = new ThreeNumMaxProduct();
        int[] input = {-1, -2, -3, 4};
        System.out.println(tnmp.maximumProduct(input));
    }
}

