package org.joker.leetcode.no119;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行
 *
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-07-04 10:16
 */
public class YoungsTriangle2 {
    /**
     * 执行用时 :4 ms, 在所有 Java 提交中击败了21.13%的用户
     * 内存消耗 :34.1 MB, 在所有 Java 提交中击败了22.20%的用户
     *
     * @param rowIndex
     * @return
     */
    public List<Integer> getRow(int rowIndex) {
        int numRows = rowIndex + 1;
        List<Integer>[] arr = new List[numRows];
        for (int i = 0; i < numRows; i++) {
            arr[i] = new ArrayList<>();
        }
        if (numRows >= 1) {
            arr[0].add(1);
        }
        if (numRows >= 2) {
            arr[1].add(1);
            arr[1].add(1);
        }
        if (numRows >= 3) {
            for (int i = 2; i < numRows; i++) {
                arr[i].add(1);
                for (int j = 1; j < i; j++) {
                    arr[i].add(arr[i - 1].get(j) + arr[i - 1].get(j - 1));
                }
                arr[i].add(1);
            }
        }
        return arr[rowIndex];
    }

    /**
     * 执行用时 :1 ms, 在所有 Java 提交中击败了99.56%的用户
     * 内存消耗 :34.6 MB, 在所有 Java 提交中击败了21.84%的用户
     * @param rowIndex
     * @return
     */
    public List<Integer> getRow1(int rowIndex) {
        List<Integer> list = new ArrayList<>(rowIndex + 1);
        list.add(1);
        for (int i = 1; i < rowIndex + 1; i++) {
            list.add((int)((long)list.get(i - 1) * (long)(rowIndex - i + 1) / (long)i));
        }
        return list;
    }


    public static void main(String[] args) {
        YoungsTriangle2 yt2 = new YoungsTriangle2();
        List<Integer> output = yt2.getRow1(3);
        for ( int i :output) {
            System.out.println(i);
        }
    }
}

