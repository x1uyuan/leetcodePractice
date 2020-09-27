//给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。 
//
// 
//
// 
// 
//
// 示例 1: 
//
// 输入: 5
//输出: 2
//解释: 5 的二进制表示为 101（没有前导零位），其补数为 010。所以你需要输出 2 。
// 
//
// 示例 2: 
//
// 输入: 1
//输出: 0
//解释: 1 的二进制表示为 1（没有前导零位），其补数为 0。所以你需要输出 0 。
// 
//
// 
//
// 注意: 
//
// 
// 给定的整数保证在 32 位带符号整数的范围内。 
// 你可以假定二进制数不包含前导零位。 
// 本题与 1009 https://leetcode-cn.com/problems/complement-of-base-10-integer/ 相同 
// 
// Related Topics 位运算 
// 👍 179 👎 0


package leetcode.editor.cn;

/**
 * Java：数字的补数
 * date：2020-09-27 15:12:56
 **/
public class P476NumberComplement {
    public static void main(String[] args) {
        Solution solution = new P476NumberComplement().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findComplement(int num) {
//            String bstring = Integer.toBinaryString(num);
//            int mul = 1;
//            int res = 0;
//            for (int i = bstring.length() - 1; i >= 0 ; i--) {
//                res += ('1' - bstring.charAt(i)) * mul;
//                mul = mul << 1;
//            }
//            return res;

            int shift = 0;
            int num1 = num;
            while (num1 != 0) {
                num1 = num1 >> 1;
                shift++;
            }
            return ((~num) << (32 - shift)) >> (32 - shift);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
