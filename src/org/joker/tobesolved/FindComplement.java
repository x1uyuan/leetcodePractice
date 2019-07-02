package org.joker.tobesolved;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-05-13 23:55
 */
public class FindComplement {
    public int findComplement(int num) {
        if(num < Integer.MAX_VALUE){
            String str = Integer.toBinaryString(num);
            int nums = str.length();
            return (int) Math.pow(2,nums)-1-num;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        FindComplement findComplement = new FindComplement();
        int input = 2147483646;
//        System.out.println(Integer.MAX_VALUE);
        System.out.println(findComplement.findComplement(input));
    }
}

