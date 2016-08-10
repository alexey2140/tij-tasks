package chapter03.task02;

public class Solution {
    static Float f = new Float(0.123456789f);
    static Object o = new Object();

    public static void main(String[] args) {
        System.out.println(f);
        System.out.println(o);

        o = f;

        System.out.println(f);
        System.out.println(o);


    }


}
