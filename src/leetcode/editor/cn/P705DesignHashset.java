//不使用任何内建的哈希表库设计一个哈希集合 
//
// 具体地说，你的设计应该包含以下的功能 
//
// 
// add(value)：向哈希集合中插入一个值。 
// contains(value) ：返回哈希集合中是否存在这个值。 
// remove(value)：将给定值从哈希集合中删除。如果哈希集合中没有这个值，什么也不做。 
// 
//
// 
//示例: 
//
// MyHashSet hashSet = new MyHashSet();
//hashSet.add(1);     
//hashSet.add(2);     
//hashSet.contains(1); // 返回 true
//hashSet.contains(3); // 返回 false (未找到)
//hashSet.add(2);     
//hashSet.contains(2); // 返回 true
//hashSet.remove(2);     
//hashSet.contains(2); // 返回  false (已经被删除)
// 
//
// 
//注意： 
//
// 
// 所有的值都在 [0, 1000000]的范围内。 
// 操作的总数目在[1, 10000]范围内。 
// 不要使用内建的哈希集合库。 
// 
// Related Topics 设计 哈希表 
// 👍 67 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * Java：设计哈希集合
 * date：2020-11-02 14:07:25
 **/
public class P705DesignHashset {
    public static void main(String[] args) {
//        Solution solution = new P705DesignHashset().new Solution();
        // TO TEST
        MyHashSet hashSet = new MyHashSet();
        hashSet.add(1);    
        hashSet.add(2);
        System.out.println(hashSet.contains(1)); // 返回 true
        System.out.println(hashSet.contains(3)); // 返回 false (未找到)
        hashSet.add(2);
        System.out.println(hashSet.contains(2)); // 返回 true
        hashSet.remove(2);
        System.out.println(hashSet.contains(2)); // 返回  false (已经被删除)
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    static class MyHashSet {
        private boolean[] num;

        /**
         * Initialize your data structure here.
         */
        public MyHashSet() {
            num = new boolean[1000001];
        }

        public void add(int key) {
            num[key] = true;
        }

        public void remove(int key) {
            num[key] = false;
        }

        /**
         * Returns true if this set contains the specified element
         */
        public boolean contains(int key) {
            return num[key];
        }
    }

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
//leetcode submit region end(Prohibit modification and deletion)

}
