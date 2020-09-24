//给你一个按 YYYY-MM-DD 格式表示日期的字符串 date，请你计算并返回该日期是当年的第几天。 
//
// 通常情况下，我们认为 1 月 1 日是每年的第 1 天，1 月 2 日是每年的第 2 天，依此类推。每个月的天数与现行公元纪年法（格里高利历）一致。 
//
// 
//
// 示例 1： 
//
// 输入：date = "2019-01-09"
//输出：9
// 
//
// 示例 2： 
//
// 输入：date = "2019-02-10"
//输出：41
// 
//
// 示例 3： 
//
// 输入：date = "2003-03-01"
//输出：60
// 
//
// 示例 4： 
//
// 输入：date = "2004-03-01"
//输出：61 
//
// 
//
// 提示： 
//
// 
// date.length == 10 
// date[4] == date[7] == '-'，其他的 date[i] 都是数字。 
// date 表示的范围从 1900 年 1 月 1 日至 2019 年 12 月 31 日。 
// 
// Related Topics 数学 
// 👍 27 👎 0


package leetcode.editor.cn;

/**
 * Java：一年中的第几天
 * date：2020-09-23 14:50:49
 **/
public class P1154DayOfTheYear {
    public static void main(String[] args) {
        Solution solution = new P1154DayOfTheYear().new Solution();
        // TO TEST
        System.out.println(solution.dayOfYear("2019-01-09"));
        System.out.println(solution.dayOfYear("2019-02-10"));
        System.out.println(solution.dayOfYear("2003-03-01"));
        System.out.println(solution.dayOfYear("2004-03-01"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int dayOfYear(String date) {
            int[] days = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
            String[] s = date.split("-");
            int year = Integer.parseInt(s[0]);
            int month = Integer.parseInt(s[1]);
            int day = Integer.parseInt(s[2]);
            int res = days[month - 1] + day;
            if (month < 3) return days[month - 1] + day;
            else {
                if (year % 4 == 0) {
                    if (year % 100 != 0) return res + 1;
                    else if (year % 400 == 0) return res + 1;
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
