package chapter05.task04;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution("ABC");
    }

    Solution() {
        System.out.println("Привет, я конструктор Solution и я " +
                "вывожу это сообщение при создании экземпляра класса Solution");
    }

    Solution(String s) {
        System.out.println("Привет, я конструктор Solution и я" +
                " вывожу это сообщение при создании экземпляра класса Solution," +
                " а так же, я вывожу вот эту " + s + " переменную, её передали мне" +
                " в качестве параметра при создании экземпляра класса");
    }
}