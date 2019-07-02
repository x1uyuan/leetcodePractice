package org.joker.leetcode.no136;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-05-09 19:15
 */
public class SingleNumber {
    /**
     * Runtime: 12 ms, faster than 8.46% of Java online submissions for Single Number.
     * Memory Usage: 38.2 MB, less than 72.06% of Java online submissions for Single Number.
     *
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int result = 0;
        HashMap hm = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                int temp = (int) hm.get(nums[i]);
                hm.remove(nums[i]);
                hm.put(nums[i], ++temp);
            } else {
                hm.put(nums[i], 1);
            }
        }
        Iterator iter = hm.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            if ((int) entry.getValue() % 2 == 1) {
                Object key = entry.getKey();
                result = (int) key;
            }
        }
        return result;

    }
}

