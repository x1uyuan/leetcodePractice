package org.joker.leetcode.no66;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，
 * 在该数的基础上加一。  最高位数字存放在数组的首位，
 * 数组中每个元素只存储一个数字。  你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-07-03 16:31
 */
public class PlusOne {
    /**
     * 执行用时 :1 ms, 在所有 Java 提交中击败了98.55%的用户
     * 内存消耗 :34.8 MB, 在所有 Java 提交中击败了50.16%的用户
     *
     * @param digits
     * @return
     */
    public int[] plusOne(int[] digits) {
        int count = digits.length;
        digits[count - 1] += 1;
        for (int i = count - 1; i > 0; i--) {
            digits[i - 1] += digits[i] / 10;
            digits[i] = digits[i] % 10;
        }
        if (digits[0] == 10) {
            int[] res = new int[count + 1];
            res[0] = 1;
            res[1] = 0;
            for (int i = 2; i < res.length; i++) {
                res[i] = digits[i - 1];
            }
            return res;
        }
        return digits;
    }

    /**
     * 数组元素过多时会报异常
     * @param digits
     * @return
     */
    public int[] plusOne1(int[] digits) {
        String tmp = "";
        for (int i = 0; i < digits.length; i++) {
            tmp += digits[i];
        }
        Long num = Long.parseLong(tmp);
        tmp = "" + (num+1);
        char[] c = tmp.toCharArray();
        int[] res = new int[c.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = Integer.parseInt(""+c[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        PlusOne po = new PlusOne();
        int[] input = {9,8,7,6,5,4,3,2,1,0};
        int[] output = po.plusOne1(input);
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}

