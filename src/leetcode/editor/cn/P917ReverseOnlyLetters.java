//给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转。 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 输入："ab-cd"
//输出："dc-ba"
// 
//
// 示例 2： 
//
// 输入："a-bC-dEf-ghIj"
//输出："j-Ih-gfE-dCba"
// 
//
// 示例 3： 
//
// 输入："Test1ng-Leet=code-Q!"
//输出："Qedo1ct-eeLg=ntse-T!"
// 
//
// 
//
// 提示： 
//
// 
// S.length <= 100 
// 33 <= S[i].ASCIIcode <= 122 
// S 中不包含 \ or " 
// 
// Related Topics 字符串 
// 👍 60 👎 0


package leetcode.editor.cn;

import java.util.Stack;

/**
 * Java：仅仅反转字母
 * date：2020-08-21 13:40:09
 **/
public class P917ReverseOnlyLetters {
    public static void main(String[] args) {
        Solution solution = new P917ReverseOnlyLetters().new Solution();
        // TO TEST
        System.out.println(solution.reverseOnlyLetters("a-bC-dEf-ghIj"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseOnlyLetters(String S) {
            Stack<Character> letters = new Stack();
            for (char c: S.toCharArray())
                if (Character.isLetter(c))
                    letters.push(c);

            StringBuilder ans = new StringBuilder();
            for (char c: S.toCharArray()) {
                if (Character.isLetter(c))
                    ans.append(letters.pop());
                else
                    ans.append(c);
            }

            return ans.toString();
        }

        public boolean isLetter(char c) {
            int a = c - 'a';
            int b = c - 'A';
            if ((a >= 0 && a <= 26) || (b >= 0 && b <= 26)) return true;
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
