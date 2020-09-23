//给定仅有小写字母组成的字符串数组 A，返回列表中的每个字符串中都显示的全部字符（包括重复字符）组成的列表。例如，如果一个字符在每个字符串中出现 3 次，但不
//是 4 次，则需要在最终答案中包含该字符 3 次。 
//
// 你可以按任意顺序返回答案。 
//
// 
//
// 示例 1： 
//
// 输入：["bella","label","roller"]
//输出：["e","l","l"]
// 
//
// 示例 2： 
//
// 输入：["cool","lock","cook"]
//输出：["c","o"]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= A.length <= 100 
// 1 <= A[i].length <= 100 
// A[i][j] 是小写字母 
// 
// Related Topics 数组 哈希表 
// 👍 97 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Java：查找常用字符
 * date：2020-09-21 10:43:28
 **/
public class P1002FindCommonCharacters {
    public static void main(String[] args) {
        Solution solution = new P1002FindCommonCharacters().new Solution();
        // TO TEST
        List<String> out = solution.commonChars(new String[]{"bella", "label", "roller"});
        for (String s : out) System.out.println(s);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<String> commonChars(String[] A) {
            List<String> res = new ArrayList<>();
            int len = A.length;
            if (len == 0) return res;
            int[][] count = new int[len][26];
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[i].length(); j++) {
                    int place = A[i].charAt(j) - 'a';
                    count[i][place] = count[i][place] + 1;
                }
            }
            for (int i = 0; i < 26; i++) {
                int min = Integer.MAX_VALUE;
                for (int j = 0; j < len; j++) {
                    min = min < count[j][i] ? min : count[j][i];
                }
                for (int j = 0; j < min; j++) {
                    res.add("" + (char) ('a' + i));
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
