package chapter02.task06;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        String text = "abc";
        System.out.println(s.storage(text));
    }

    int storage(String s) {
        return s.length() * 2;
    }
}
