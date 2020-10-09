//给出第一个词 first 和第二个词 second，考虑在某些文本 text 中可能以 "first second third" 形式出现的情况，其中 se
//cond 紧随 first 出现，third 紧随 second 出现。 
//
// 对于每种这样的情况，将第三个词 "third" 添加到答案中，并返回答案。 
//
// 
//
// 示例 1： 
//
// 输入：text = "alice is a good girl she is a good student", first = "a", second =
// "good"
//输出：["girl","student"]
// 
//
// 示例 2： 
//
// 输入：text = "we will we will rock you", first = "we", second = "will"
//输出：["we","rock"]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= text.length <= 1000 
// text 由一些用空格分隔的单词组成，每个单词都由小写英文字母组成 
// 1 <= first.length, second.length <= 10 
// first 和 second 由小写英文字母组成 
// 
// Related Topics 哈希表 
// 👍 15 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Java：Bigram 分词
 * date：2020-10-09 14:11:40
 **/
public class P1078OccurrencesAfterBigram {
    public static void main(String[] args) {
        Solution solution = new P1078OccurrencesAfterBigram().new Solution();
        // TO TEST
        String[] out = solution.findOcurrences("alice is a good girl she is a good student", "a", "good");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String[] findOcurrences(String text, String first, String second) {
            String[] textArray = text.split(" ");
            List<String> lst = new ArrayList<>();
            int len = textArray.length;
            if (len < 3) return new String[0];
            for (int i = 0; i < len - 2; i++) {
                if (first.equals(textArray[i]) && second.equals(textArray[i + 1])) {
                    lst.add(textArray[i + 2]);
                }
            }
            String[] res = new String[lst.size()];
            lst.toArray(res);
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
