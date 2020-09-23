//给定一个单词，你需要判断单词的大写使用是否正确。 
//
// 我们定义，在以下情况时，单词的大写用法是正确的： 
//
// 
// 全部字母都是大写，比如"USA"。 
// 单词中所有字母都不是大写，比如"leetcode"。 
// 如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。 
// 
//
// 否则，我们定义这个单词没有正确使用大写字母。 
//
// 示例 1: 
//
// 
//输入: "USA"
//输出: True
// 
//
// 示例 2: 
//
// 
//输入: "FlaG"
//输出: False
// 
//
// 注意: 输入是由大写和小写拉丁字母组成的非空单词。 
// Related Topics 字符串 
// 👍 108 👎 0


package leetcode.editor.cn;

/**
 * Java：检测大写字母
 * date：2020-09-14 15:26:21
 **/
public class P520DetectCapital {
    public static void main(String[] args) {
        Solution solution = new P520DetectCapital().new Solution();
        // TO TEST
        System.out.println(solution.detectCapitalUse("USA"));
        System.out.println(solution.detectCapitalUse("FlaG"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean detectCapitalUse(String word) {
            return word.toLowerCase().equals(word) || word.toUpperCase().equals(word) || CapitalUseHelper(word);
        }

        private boolean CapitalUseHelper(String word) {
            char fp = word.charAt(0);
            String sp = word.substring(1);
            return (fp - 'A' >= 0 && fp - 'A' <= 25) && sp.toLowerCase().equals(sp);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
