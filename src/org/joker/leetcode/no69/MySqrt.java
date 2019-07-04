package org.joker.leetcode.no69;

/**
 * @author wivtp
 * @description 实现 int sqrt(int x) 函数。
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去
 * @versin 1.0.0
 * @since 2019-07-04
 */
public class MySqrt {
    /**
     * 执行用时 :5 ms, 在所有 Java 提交中击败了98.11%的用户
     * 内存消耗 :34 MB, 在所有 Java 提交中击败了75.02%的用户
     *
     * @param x
     * @return
     */
    public int mySqrt(int x) {
        return (int) Math.sqrt(x);
    }

    /**
     * 执行用时 :
     * 65 ms, 在所有 Java 提交中击败了6.49%的用户
     * 内存消耗 :33.5 MB, 在所有 Java 提交中击败了75.54%的用户
     * @param x
     * @return
     */
    public int mySqrt1(int x) {
        int res = 0;
        for (int i = 0; i < 46341; i++) {
            if ((long) i * i <= (long) x && (long) (i + 1) * (i + 1) > (long) x) {
                res = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        MySqrt ms = new MySqrt();
        System.out.println(2147395600 > Integer.MAX_VALUE);
        System.out.println(Math.sqrt(Integer.MAX_VALUE));
        System.out.println(Math.sqrt(2147395600));
        System.out.println(ms.mySqrt1(2147395600));
    }
}

