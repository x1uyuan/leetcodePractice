package org.joker.leetcode.no537;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-05-15 18:41
 */
public class ComplexNumberMultiply {
    public String complexNumberMultiply(String a, String b) {
        int A = Integer.valueOf(a.split("\\+")[0]);
        int B = Integer.valueOf(a.split("\\+")[1].split("i")[0]);
        int C = Integer.valueOf(b.split("\\+")[0]);
        int D = Integer.valueOf(b.split("\\+")[1].split("i")[0]);
        int realPart = A * C - B * D;
        int imaginaryPart = A * D + B * C;
        return String.valueOf(realPart) + "+" + String.valueOf(imaginaryPart) + "i";
    }
}

