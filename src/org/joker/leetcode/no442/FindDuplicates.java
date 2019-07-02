package org.joker.leetcode.no442;

import java.util.*;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-06-13 10:56
 */
public class FindDuplicates {
    /**
     * 执行用时 :107 ms, 在所有Java提交中击败了5.14%的用户
     * 内存消耗 :58.5 MB, 在所有Java提交中击败了18.25%的用户
     *
     * @param nums input array
     * @return list contains duplicate numbers
     */
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                int tmp = map.get(nums[i]);
                map.remove(nums[i]);
                map.put(nums[i], tmp + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                list.add(entry.getKey());
            }
        }

        return list;
    }

    /**
     * 执行用时 :17 ms, 在所有Java提交中击败了48.46%的用户
     * 内存消耗 :55.2 MB, 在所有Java提交中击败了60.81%的用户
     * @param nums
     * @return
     */
    public List<Integer> findDuplicates2(int[] nums) {
        List<Integer> rs = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i]) - 1] < 0) {
                rs.add(Math.abs(nums[i]));
            } else {
                nums[Math.abs(nums[i]) - 1] *= -1;
            }
        }
        return rs;
    }

    /**
     *执行用时 :53 ms, 在所有Java提交中击败了19.52%的用户
     * 内存消耗 :55.4 MB, 在所有Java提交中击败了58.45%的用户
     * @param nums
     * @return
     */
    public List<Integer> findDuplicates3(int[] nums) {
        List<Integer> rs = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) {
                rs.add(nums[i]);
            }
        }
        return rs;
    }

    /**
     * 执行用时 :68 ms, 在所有Java提交中击败了10.96%的用户
     * 内存消耗 :71.8 MB, 在所有Java提交中击败了5.08%的用户
     * @param nums
     * @return
     */
    public List<Integer> findDuplicates4(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                list.add(nums[i]);
            } else {
                map.put(nums[i], 1);
            }
        }
        return list;
    }


    public static void main(String[] args) {
        FindDuplicates fd = new FindDuplicates();
        int[] input = {1, 1};
        System.out.println(fd.findDuplicates(input));
    }
}

