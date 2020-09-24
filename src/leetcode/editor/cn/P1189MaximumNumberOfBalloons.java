//给你一个字符串 text，你需要使用 text 中的字母来拼凑尽可能多的单词 "balloon"（气球）。 
//
// 字符串 text 中的每个字母最多只能被使用一次。请你返回最多可以拼凑出多少个单词 "balloon"。 
//
// 
//
// 示例 1： 
//
// 
//
// 输入：text = "nlaebolko"
//输出：1
// 
//
// 示例 2： 
//
// 
//
// 输入：text = "loonbalxballpoon"
//输出：2
// 
//
// 示例 3： 
//
// 输入：text = "leetcode"
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 1 <= text.length <= 10^4 
// text 全部由小写英文字母组成 
// 
// Related Topics 哈希表 字符串 
// 👍 42 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Java：“气球” 的最大数量
 * date：2020-09-24 14:26:38
 **/
public class P1189MaximumNumberOfBalloons {
    public static void main(String[] args) {
        Solution solution = new P1189MaximumNumberOfBalloons().new Solution();
        // TO TEST
        System.out.println(solution.maxNumberOfBalloons("nlaebolko"));
        System.out.println(solution.maxNumberOfBalloons("loonbalxballpoon"));
        System.out.println(solution.maxNumberOfBalloons("leetcode"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxNumberOfBalloons(String text) {
            int[] tmp = new int[5];
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if (c == 'a') tmp[0] = tmp[0] + 1;
                else if (c == 'b') tmp[1] = tmp[1] + 1;
                else if (c == 'n') tmp[2] = tmp[2] + 1;
                else if (c == 'l') tmp[3] = tmp[3] + 1;
                else if (c == 'o') tmp[4] = tmp[4] + 1;
            }
            for (int i = 3; i < 5; i++) {
                tmp[i] = tmp[i] / 2;
            }
            int min = Integer.MAX_VALUE;
            for (int i : tmp) {
                if (i < min) min = i;
            }
            return min;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
