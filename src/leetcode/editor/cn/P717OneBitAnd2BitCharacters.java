//有两种特殊字符。第一种字符可以用一比特0来表示。第二种字符可以用两比特(10 或 11)来表示。 
//
// 现给一个由若干比特组成的字符串。问最后一个字符是否必定为一个一比特字符。给定的字符串总是由0结束。 
//
// 示例 1: 
//
// 
//输入: 
//bits = [1, 0, 0]
//输出: True
//解释: 
//唯一的编码方式是一个两比特字符和一个一比特字符。所以最后一个字符是一比特字符。
// 
//
// 示例 2: 
//
// 
//输入: 
//bits = [1, 1, 1, 0]
//输出: False
//解释: 
//唯一的编码方式是两比特字符和两比特字符。所以最后一个字符不是一比特字符。
// 
//
// 注意: 
//
// 
// 1 <= len(bits) <= 1000. 
// bits[i] 总是0 或 1. 
// 
// Related Topics 数组 
// 👍 146 👎 0


package leetcode.editor.cn;

/**
 * Java：1比特与2比特字符
 * date：2020-09-14 11:15:24
 **/
public class P717OneBitAnd2BitCharacters {
    public static void main(String[] args) {
        Solution solution = new P717OneBitAnd2BitCharacters().new Solution();
        // TO TEST
        System.out.println(solution.isOneBitCharacter(new int[]{1, 0, 0}));
        System.out.println(solution.isOneBitCharacter(new int[]{1, 1, 1, 0}));
        System.out.println(solution.isOneBitCharacter(new int[]{0, 0, 0}));
        System.out.println(solution.isOneBitCharacter(new int[]{0, 0, 0, 0}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isOneBitCharacter(int[] bits) {
            int len = bits.length;
            if (len == 1) return bits[0] == 0;
            if (len == 2) return bits[0] == 0 && bits[1] == 0;
            boolean[] dp = new boolean[len - 1];
            dp[0] = bits[0] == 0;
            dp[1] = bits[0] == 1 || (bits[0] == 0 && bits[1] == 0);
            for (int i = 2; i < len - 1; i++) {
                dp[i] = (dp[i - 1] && bits[i] == 0) || (dp[i - 2] && bits[i - 1] == 1);
            }
            return dp[len - 2] && bits[len - 1] == 0;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
