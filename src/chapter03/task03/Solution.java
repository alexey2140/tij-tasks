package chapter03.task03;

import java.util.Random;

public class Solution {
    static float f = 0.123f;

    public static void changeFloat(float f) {
        Solution s = new Solution();
        s.f = f + 1.123f;
    }
    public static void main(String[] args) {
        System.out.println(f);
        changeFloat(f);
        System.out.println(f);
        Random rand = new Random();
        int j = rand.nextInt(100) + 1;
        System.out.println(j);
    }
}