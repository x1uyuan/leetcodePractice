package org.joker.leetcode.no202;

import java.util.HashSet;

/**
 * 编写一个算法来判断一个数是不是“快乐数”。
 * 一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，
 * 然后重复这个过程直到这个数变为 1，也可能是无限循环但始终变不到 1。
 * 如果可以变为 1，那么这个数就是快乐数。
 *
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-07-04 12:57
 */
public class HappyNum {
    /**
     * 执行用时 :4 ms, 在所有 Java 提交中击败了75.99%的用户
     * 内存消耗 :33.5 MB, 在所有 Java 提交中击败了29.47%的用户
     * @param n
     * @return
     */
    public boolean isHappy(int n) {
        int input = n;
        HashSet<Integer> set = new HashSet<>();
        set.add(input);
        while (input != 1){
            input = doSquare4Each(input);
            if (set.contains(input)){
                return false;
            }
            set.add(input);
        }
        return true;
    }

    public int doSquare4Each(int n) {
        int res = 0;
        while (n > 0) {
            int tmp = n % 10;
            res += (tmp * tmp);
            n /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        HappyNum hn = new HappyNum();
        int input = 19;
        System.out.println(hn.isHappy(input));
    }
}

