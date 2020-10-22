//字符串 S 由小写字母组成。我们要把这个字符串划分为尽可能多的片段，同一个字母只会出现在其中的一个片段。返回一个表示每个字符串片段的长度的列表。 
//
// 
//
// 示例 1： 
//
// 输入：S = "ababcbacadefegdehijhklij"
//输出：[9,7,8]
//解释：
//划分结果为 "ababcbaca", "defegde", "hijhklij"。
//每个字母最多出现在一个片段中。
//像 "ababcbacadefegde", "hijhklij" 的划分是错误的，因为划分的片段数较少。
// 
//
// 
//
// 提示： 
//
// 
// S的长度在[1, 500]之间。 
// S只包含小写字母 'a' 到 'z' 。 
// 
// Related Topics 贪心算法 双指针 
// 👍 276 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * Java：划分字母区间
 * date：2020-10-22 09:29:42
 **/
public class P763PartitionLabels {
    public static void main(String[] args) {
        Solution solution = new P763PartitionLabels().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<Integer> res = new ArrayList<>();

        public List<Integer> partitionLabels(String S) {
            int len = S.length();
            int start = 0;
            while (len > 0) {
                int tmp = helper(S, start);
                res.add(tmp);
                start += tmp;
            }
            return res;
        }

        private int helper(String s, int start) {
            char c = s.charAt(start);
            int maxIndex = s.lastIndexOf(c);
            for (int i = start + 1; i < maxIndex; i++) {
                char tmp = s.charAt(i);
                if (s.lastIndexOf(tmp) > maxIndex) maxIndex = s.lastIndexOf(tmp);
            }
            return maxIndex - start + 1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
