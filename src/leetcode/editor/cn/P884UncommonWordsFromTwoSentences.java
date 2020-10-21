//给定两个句子 A 和 B 。 （句子是一串由空格分隔的单词。每个单词仅由小写字母组成。） 
//
// 如果一个单词在其中一个句子中只出现一次，在另一个句子中却没有出现，那么这个单词就是不常见的。 
//
// 返回所有不常用单词的列表。 
//
// 您可以按任何顺序返回列表。 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 输入：A = "this apple is sweet", B = "this apple is sour"
//输出：["sweet","sour"]
// 
//
// 示例 2： 
//
// 输入：A = "apple apple", B = "banana"
//输出：["banana"]
// 
//
// 
//
// 提示： 
//
// 
// 0 <= A.length <= 200 
// 0 <= B.length <= 200 
// A 和 B 都只包含空格和小写字母。 
// 
// Related Topics 哈希表 
// 👍 67 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Java：两句话中的不常见单词
 * date：2020-10-21 13:29:25
 **/
public class P884UncommonWordsFromTwoSentences {
    public static void main(String[] args) {
        Solution solution = new P884UncommonWordsFromTwoSentences().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String[] uncommonFromSentences(String A, String B) {
            String[] wordsA = A.split(" ");
            String[] wordsB = B.split(" ");
            List<String> lst = new ArrayList<>();
            Map<String, Integer> map1 = new HashMap<>();
            Map<String, Integer> map2 = new HashMap<>();
            for (String s : wordsA) {
                map1.put(s, map1.getOrDefault(s, 0) + 1);
            }
            for (String s : wordsB) {
                map2.put(s, map2.getOrDefault(s, 0) + 1);
            }
            for (String s : map1.keySet()) {
                if (map1.get(s) == 1 && !map2.containsKey(s)) {
                    lst.add(s);
                }
            }
            for (String s : map2.keySet()) {
                if (map2.get(s) == 1 && !map1.containsKey(s)) {
                    lst.add(s);
                }
            }
            String[] res = new String[lst.size()];
            return lst.toArray(res);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
