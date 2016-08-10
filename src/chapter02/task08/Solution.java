package chapter02.task08;

public class Solution {
        static int i = 47;

        public static void main(String[] args) {
            Solution st1 = new Solution();
            Solution st2 = new Solution();
            Solution st3 = new Solution();
            Solution st4 = new Solution();
            Solution st5 = new Solution();
            Solution st6 = new Solution();
            Solution st7 = new Solution();
            Solution st8 = new Solution();
            Solution st9 = new Solution();
            Solution st10 = new Solution();
            Solution st11 = new Solution();
            Incrementable.increment();
            System.out.println(st1.i);
            System.out.println(st2.i);
            System.out.println(st3.i);
            System.out.println(st4.i);
            System.out.println(st5.i);
            System.out.println(st6.i);
            System.out.println(st7.i);
            System.out.println(st8.i);
            System.out.println(st9.i);
            System.out.println(st10.i);
            System.out.println(st11.i);
        }
    }

    class Incrementable {
        static void increment() {
            Solution.i++;
        }
    }
