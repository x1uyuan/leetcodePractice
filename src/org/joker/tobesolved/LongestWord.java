package org.joker.tobesolved;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-06-12 16:33
 */
public class LongestWord {
    public String longestWord(String[] words) {
        if (words.length == 1) {
            return words[0];
        }
        int maxLength = words[0].length();
        String result = "";
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > maxLength) {
                maxLength = words[i].length();
                result = words[i];
            } else if (words[i].length() == maxLength) {
                result = result.compareTo(words[i]) <= 0 ? words[i] :result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        LongestWord lw = new LongestWord();
        String[] input = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        System.out.println(lw.longestWord(input));
    }
}

