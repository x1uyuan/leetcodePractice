//在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。 
//
// 示例: 
//
// s = "abaccdeff"
//返回 "b"
//
//s = "" 
//返回 " "
// 
//
// 
//
// 限制： 
//
// 0 <= s 的长度 <= 50000 
// Related Topics 哈希表 
// 👍 39 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Java：第一个只出现一次的字符
 * date：2020-07-28 10:33:01
 **/
public class POffer50DiYiGeZhiChuXianYiCiDeZiFuLcof {
    public static void main(String[] args) {
        Solution solution = new POffer50DiYiGeZhiChuXianYiCiDeZiFuLcof().new Solution();
        // TO TEST
        System.out.println(solution.firstUniqChar("cc"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public char firstUniqChar(String s) {
            int len = s.length();
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < len; i++) {
                char tmp = s.charAt(i);
                if (s.lastIndexOf(tmp) == i && !map.containsKey(tmp)) return tmp;
                map.put(tmp, 1);
            }
            return ' ';
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
