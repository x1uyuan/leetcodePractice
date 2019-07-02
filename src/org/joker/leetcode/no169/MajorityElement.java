package org.joker.leetcode.no169;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-05-12 10:49
 */
public class MajorityElement {
    /**
     * 执行用时 : 54 ms, 在Majority Element的Java提交中击败了7.14% 的用户
     * 内存消耗 : 49.7 MB, 在Majority Element的Java提交中击败了34.75% 的用户
     *
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                int tmp = hm.get(nums[i]);
                hm.remove(nums[i]);
                hm.put(nums[i], tmp + 1);
            } else {
                hm.put(nums[i], 1);
            }
        }
        int result = 0;

        Iterator<Map.Entry<Integer, Integer>> iterator = hm.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            if (entry.getValue() > Math.floor(nums.length / 2)) {
                result = entry.getKey();
                break;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        int[] nums = {2, 2, 1, 1, 1, 2, 2, 1, 1};
        System.out.println(majorityElement.majorityElement(nums));
    }
}

