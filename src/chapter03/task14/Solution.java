package chapter03.task14;

import java.util.Random;

public class Solution {

    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(12) - 10;
        System.out.println(a);
    }
}