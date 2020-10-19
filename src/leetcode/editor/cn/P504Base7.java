//给定一个整数，将其转化为7进制，并以字符串形式输出。 
//
// 示例 1: 
//
// 
//输入: 100
//输出: "202"
// 
//
// 示例 2: 
//
// 
//输入: -7
//输出: "-10"
// 
//
// 注意: 输入范围是 [-1e7, 1e7] 。 
// 👍 62 👎 0


package leetcode.editor.cn;

/**
 * Java：七进制数
 * date：2020-10-19 10:21:06
 **/
public class P504Base7 {
    public static void main(String[] args) {
        Solution solution = new P504Base7().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String convertToBase7(int num) {
            if (num == 0) return "0";
            String flag = "";
            if (num < 0) flag = "-";
            int numCopy = Math.abs(num);
            StringBuilder sb = new StringBuilder();
            while (numCopy > 0) {
                sb.append(numCopy % 7);
                numCopy /= 7;
            }
            sb.append(flag);
            return sb.reverse().toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
