//给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。键盘如下图所示。 
//
// 
//
// 
//
// 
//
// 示例： 
//
// 输入: ["Hello", "Alaska", "Dad", "Peace"]
//输出: ["Alaska", "Dad"]
// 
//
// 
//
// 注意： 
//
// 
// 你可以重复使用键盘上同一字符。 
// 你可以假设输入的字符串将只包含字母。 
// Related Topics 哈希表 
// 👍 105 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Java：键盘行
 * date：2020-09-04 15:56:26
 **/
public class P500KeyboardRow {
    public static void main(String[] args) {
        Solution solution = new P500KeyboardRow().new Solution();
        // TO TEST
        String[] in = new String[]{"Hello", "Alaska", "Dad", "Peace"};
        String[] out = solution.findWords(in);
        for (String s : out) {
            System.out.println(s);
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String[] findWords(String[] words) {
            Map<Character, Integer> map = new HashMap<>();
            map.put('q', 0);
            map.put('w', 0);
            map.put('e', 0);
            map.put('r', 0);
            map.put('t', 0);
            map.put('y', 0);
            map.put('u', 0);
            map.put('i', 0);
            map.put('o', 0);
            map.put('p', 0);

            map.put('a', 1);
            map.put('s', 1);
            map.put('d', 1);
            map.put('f', 1);
            map.put('g', 1);
            map.put('h', 1);
            map.put('j', 1);
            map.put('k', 1);
            map.put('l', 1);

            map.put('z', 2);
            map.put('x', 2);
            map.put('c', 2);
            map.put('v', 2);
            map.put('b', 2);
            map.put('n', 2);
            map.put('m', 2);

            List<String> lst = new ArrayList<>();

            for (int i = 0; i < words.length; i++) {
                int flag = 0;
                String tmp = words[i].toLowerCase();
                int val = map.get(tmp.charAt(0));
                for (int j = 1; j < tmp.length(); j++) {
                    if (map.get(tmp.charAt(j)) != val) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    lst.add(words[i]);
                }
            }
            int size = lst.size();
            String[] res = new String[size];
            for (int i = 0; i < size; i++) {
                res[i] = lst.get(i);
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
