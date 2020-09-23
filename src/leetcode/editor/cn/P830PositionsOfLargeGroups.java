//在一个由小写字母构成的字符串 S 中，包含由一些连续的相同字符所构成的分组。 
//
// 例如，在字符串 S = "abbxxxxzyy" 中，就含有 "a", "bb", "xxxx", "z" 和 "yy" 这样的一些分组。 
//
// 我们称所有包含大于或等于三个连续字符的分组为较大分组。找到每一个较大分组的起始和终止位置。 
//
// 最终结果按照字典顺序输出。 
//
// 示例 1: 
//
// 
//输入: "abbxxxxzzy"
//输出: [[3,6]]
//解释: "xxxx" 是一个起始于 3 且终止于 6 的较大分组。
// 
//
// 示例 2: 
//
// 
//输入: "abc"
//输出: []
//解释: "a","b" 和 "c" 均不是符合要求的较大分组。
// 
//
// 示例 3: 
//
// 
//输入: "abcdddeeeeaabbbcd"
//输出: [[3,5],[6,9],[12,14]] 
//
// 说明: 1 <= S.length <= 1000 
// Related Topics 数组 
// 👍 52 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * Java：较大分组的位置
 * date：2020-09-15 16:11:12
 **/
public class P830PositionsOfLargeGroups {
    public static void main(String[] args) {
        Solution solution = new P830PositionsOfLargeGroups().new Solution();
        // TO TEST
        List<List<Integer>> out = solution.largeGroupPositions("aaa");
        for (List<Integer> lst : out) {
            for(int i : lst) {
                System.out.println(i);
            }
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> largeGroupPositions(String s) {
            int len = s.length();
            int start = 0;
            int end = 0;
            List<List<Integer>> res = new ArrayList<>();
            while (end < len) {
                if (s.charAt(end) == s.charAt(start)) {
                    if (end == len - 1) {
                        if (end - start >= 2) {
                            List<Integer> lst = new ArrayList<>();
                            lst.add(start);
                            lst.add(end);
                            res.add(lst);
                        }
                    }
                    end++;
                } else {
                    if (end - start >= 3) {
                        List<Integer> lst = new ArrayList<>();
                        lst.add(start);
                        lst.add(end - 1);
                        res.add(lst);
                    }
                    start = end;
                    end++;
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
