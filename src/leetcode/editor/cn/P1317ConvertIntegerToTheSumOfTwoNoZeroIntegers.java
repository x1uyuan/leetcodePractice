//「无零整数」是十进制表示中 不含任何 0 的正整数。 
//
// 给你一个整数 n，请你返回一个 由两个整数组成的列表 [A, B]，满足： 
//
// 
// A 和 B 都是无零整数 
// A + B = n 
// 
//
// 题目数据保证至少有一个有效的解决方案。 
//
// 如果存在多个有效解决方案，你可以返回其中任意一个。 
//
// 
//
// 示例 1： 
//
// 输入：n = 2
//输出：[1,1]
//解释：A = 1, B = 1. A + B = n 并且 A 和 B 的十进制表示形式都不包含任何 0 。
// 
//
// 示例 2： 
//
// 输入：n = 11
//输出：[2,9]
// 
//
// 示例 3： 
//
// 输入：n = 10000
//输出：[1,9999]
// 
//
// 示例 4： 
//
// 输入：n = 69
//输出：[1,68]
// 
//
// 示例 5： 
//
// 输入：n = 1010
//输出：[11,999]
// 
//
// 
//
// 提示： 
//
// 
// 2 <= n <= 10^4 
// 
// Related Topics 数学 
// 👍 17 👎 0


package leetcode.editor.cn;

/**
 * Java：将整数转换为两个无零整数的和
 * date：2020-10-14 16:14:19
 **/
public class P1317ConvertIntegerToTheSumOfTwoNoZeroIntegers {
    public static void main(String[] args) {
        Solution solution = new P1317ConvertIntegerToTheSumOfTwoNoZeroIntegers().new Solution();
        // TO TEST
        int[] out = solution.getNoZeroIntegers(1501);
        System.out.println(out[0]);
        System.out.println(out[1]);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] getNoZeroIntegers(int n) {
            int a = n / 2 + n % 2;
            int b = n / 2;
            int first = 0;
            int second = 0;
            int scale = 1;
            while (b != 0) {
                int c = a % 10;
                int d = b % 10;
                if (c == 0 && d == 9) {
                    first += scale;
                    second += 8 * scale;
                    a /= 10;
                    b /= 10;
                } else if (d == 0) {
                    first += (c + 1) * scale;
                    second += 9 * scale;
                    a /= 10;
                    b = b / 10 - 1;
                } else {
                    first += a * scale;
                    second += b * scale;
                    a /= 10;
                    b /= 10;
                }
                scale *= 10;
            }
            first += a * scale;
            return new int[]{first, second};
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
