package org.joker.leetcode.no118;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-05-14 18:49
 */
public class YoungTriangle {
    /**
     * 超出时间限制
     *
     * @param numRows
     * @return
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            res.add(generateSubist(i + 1));
        }
        return res;
    }

    public List<Integer> generateSubist(int num) {
        List<Integer> list1 = new ArrayList<>(1);
        list1.add(1);
        if (num == 1) {
            return list1;
        }
        List<Integer> list2 = new ArrayList<>(2);
        list2.add(1);
        list2.add(1);
        if (num == 2) {
            return list2;
        }
        List<Integer> list = new ArrayList<>(num);
        if (num > 2) {
            list.add(1);
            for (int i = 1; i < num - 1; i++) {
                list.add(generateSubist(num - 1).get(i) + generateSubist(num - 1).get(i - 1));
            }
            list.add(1);
        }
        return list;
    }

    /**
     * 执行用时 :1 ms, 在所有 Java 提交中击败了99.46%的用户
     * 内存消耗 :33.7 MB, 在所有 Java 提交中击败了30.57%的用户
     * @param numRows
     * @return
     */
    public List<List<Integer>> generate1(int numRows) {
        List<List<Integer>> res = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            res.add(new ArrayList<>());
        }
        if (numRows >= 1) {
            res.get(0).add(1);
        }
        if (numRows >= 2) {
            res.get(1).add(1);
            res.get(1).add(1);
        }
        if (numRows >= 3) {
            for (int i = 2; i < numRows; i++) {
                res.get(i).add(1);
                for (int j = 1; j < i; j++) {
                    res.get(i).add(res.get(i - 1).get(j) + res.get(i - 1).get(j - 1));
                }
                res.get(i).add(1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        YoungTriangle yt = new YoungTriangle();
        List<List<Integer>> output = yt.generate1(15);
        for (List<Integer> list : output) {
            for (Integer l : list) {
                System.out.println(l);
            }
            System.out.println();
        }
    }
}

