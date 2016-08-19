package chapter05.task09;

public class Solution {
    private String name;
    private int count;

    public Solution() {
        this("Hello!", 10);
        System.out.println("Конструктор по умолчанию");
    }

    public Solution(String name, int count) {
        this.name = name;
        this.count = count;
        System.out.println("Конструктор с параметрами String и int");
    }

    public static void main(String[] args) {
        Solution s = new Solution();
    }
}
