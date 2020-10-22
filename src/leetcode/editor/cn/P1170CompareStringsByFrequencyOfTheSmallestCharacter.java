//我们来定义一个函数 f(s)，其中传入参数 s 是一个非空字符串；该函数的功能是统计 s 中（按字典序比较）最小字母的出现频次。 
//
// 例如，若 s = "dcce"，那么 f(s) = 2，因为最小的字母是 "c"，它出现了 2 次。 
//
// 现在，给你两个字符串数组待查表 queries 和词汇表 words，请你返回一个整数数组 answer 作为答案，其中每个 answer[i] 是满足 
//f(queries[i]) < f(W) 的词的数目，W 是词汇表 words 中的词。 
//
// 
//
// 示例 1： 
//
// 输入：queries = ["cbd"], words = ["zaaaz"]
//输出：[1]
//解释：查询 f("cbd") = 1，而 f("zaaaz") = 3 所以 f("cbd") < f("zaaaz")。
// 
//
// 示例 2： 
//
// 输入：queries = ["bbb","cc"], words = ["a","aa","aaa","aaaa"]
//输出：[1,2]
//解释：第一个查询 f("bbb") < f("aaaa")，第二个查询 f("aaa") 和 f("aaaa") 都 > f("cc")。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= queries.length <= 2000 
// 1 <= words.length <= 2000 
// 1 <= queries[i].length, words[i].length <= 10 
// queries[i][j], words[i][j] 都是小写英文字母 
// 
// Related Topics 数组 字符串 
// 👍 29 👎 0


package leetcode.editor.cn;

/**
 * Java：比较字符串最小字母出现频次
 * date：2020-10-23 10:20:17
 **/
public class P1170CompareStringsByFrequencyOfTheSmallestCharacter {
    public static void main(String[] args) {
        Solution solution = new P1170CompareStringsByFrequencyOfTheSmallestCharacter().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] numSmallerByFrequency(String[] queries, String[] words) {
            int len1 = queries.length;
            int len2 = words.length;
            int[] res = new int[len1];
            int[] freq1 = new int[len1];
            int[] freq2 = new int[len2];
            for (int i = 0; i < len2; i++) {
                freq2[i] = calFreq(words[i]);
            }
            for (int i = 0; i < len1; i++) {
                freq1[i] = calFreq(queries[i]);
                for (int j = 0; j < len2; j++) {
                    if (freq1[i] < freq2[j]) res[i]++;
                }
            }
            return res;
        }

        private int calFreq(String s) {
            int[] counts = new int[26];
            for (int i = 0; i < s.length(); i++) {
                counts[s.charAt(i) - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                if (counts[i] != 0) return counts[i];
            }
            return -1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
