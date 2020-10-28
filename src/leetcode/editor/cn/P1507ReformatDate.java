//给你一个字符串 date ，它的格式为 Day Month Year ，其中： 
//
// 
// Day 是集合 {"1st", "2nd", "3rd", "4th", ..., "30th", "31st"} 中的一个元素。 
// Month 是集合 {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oc
//t", "Nov", "Dec"} 中的一个元素。 
// Year 的范围在 [1900, 2100] 之间。 
// 
//
// 请你将字符串转变为 YYYY-MM-DD 的格式，其中： 
//
// 
// YYYY 表示 4 位的年份。 
// MM 表示 2 位的月份。 
// DD 表示 2 位的天数。 
// 
//
// 
//
// 示例 1： 
//
// 输入：date = "20th Oct 2052"
//输出："2052-10-20"
// 
//
// 示例 2： 
//
// 输入：date = "6th Jun 1933"
//输出："1933-06-06"
// 
//
// 示例 3： 
//
// 输入：date = "26th May 1960"
//输出："1960-05-26"
// 
//
// 
//
// 提示： 
//
// 
// 给定日期保证是合法的，所以不需要处理异常输入。 
// 
// Related Topics 字符串 
// 👍 4 👎 0


package leetcode.editor.cn;

/**
 * Java：转变日期格式
 * date：2020-10-28 09:54:26
 **/
public class P1507ReformatDate {
    public static void main(String[] args) {
        Solution solution = new P1507ReformatDate().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reformatDate(String date) {
            String[] ss = date.split(" ");
            return ss[2] + handleMonth(ss[1]) + handlerDay(ss[0]);
        }

        private String handleMonth(String month) {
            switch (month) {
                case "Jan" : return "01";
                case "Feb" : return "02";
                case "Mar" : return "03";
                case "Apr" : return "04";
                case "May" : return "05";
                case "Jun" : return "06";
                case "Jul" : return "07";
                case "Aug" : return "08";
                case "Sep" : return "09";
                case "Oct" : return "10";
                case "Nov" : return "11";
                default: return "12";
            }

        }

        private String handlerDay(String day) {
            String res = "0";
            for (int i = 0; i < day.length(); i++) {
                char c = day.charAt(i);
                if (c < '0' || c > '9') break;
                else res += c;
            }
            return res.length() == 2 ? res : res.substring(1);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
