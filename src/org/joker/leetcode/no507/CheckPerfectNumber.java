package org.joker.leetcode.no507;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-06-12 14:26
 */
public class CheckPerfectNumber {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1){
            return false;
        }
        int tmp = 1;
        int lowerBound = (int) Math.sqrt(num);
        for (int i = 2; i <= lowerBound; i++) {
            if (num % i == 0) {
                tmp += i + num / i;
            }
        }
        System.out.println("tmp: " + tmp);
        System.out.println("num: " + num);
        return tmp == num;
    }

    public static void main(String[] args) {
        CheckPerfectNumber cpn = new CheckPerfectNumber();
        int input = 33550336;
        System.out.println(cpn.checkPerfectNumber(input));
    }
}

