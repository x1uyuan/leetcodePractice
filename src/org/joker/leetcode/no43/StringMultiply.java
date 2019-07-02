package org.joker.leetcode.no43;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-07-01 17:01
 */
public class StringMultiply {
    /**
     * 执行用时 :7 ms, 在所有 Java 提交中击败了96.42%的用户
     * 内存消耗 :37 MB, 在所有 Java 提交中击败了88.26%的用户
     * @param num1
     * @param num2
     * @return
     */
    public String multiply(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }
        int[] arr1 = new int[num1.length()];
        int[] arr2 = new int[num2.length()];
        int[] res = new int[num1.length() + num2.length()];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt("" + num1.charAt(i));
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt("" + num2.charAt(i));
        }
        for (int i = 0; i < res.length; i++) {
            res[i] = 0;
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                res[i + j + 1] += arr1[i] * arr2[j];
            }
        }

        for (int i = res.length - 1; i >= 1; i--) {
            res[i - 1] += (res[i] / 10);
            res[i] %= 10;
        }
        String result = "";
        for (int i = 0; i < res.length; i++) {
            result += res[i];
        }
        return result.charAt(0) == '0' ? result.substring(1) : result;
    }


    public static void main(String[] args) {
        //"1234567896432145"
        //"11234356785356"
        String input1 = "1234567896432145";
        String input2 = "11234356785356";
//        String input1 = "6913259244";
//        String input2 = "71103343";
        StringMultiply sm = new StringMultiply();
        System.out.println(sm.multiply(input1, input2));
    }
}

