package chapter02.task07;

    public class StaticTest {
        static int i = 47;

        public static void main(String[] args) {
            StaticTest st1 = new StaticTest();
            StaticTest st2 = new StaticTest();
            Incrementable.increment();
            System.out.println(st1.i);
            System.out.println(st2.i);
        }
    }

    class Incrementable {
        static void increment() {
            StaticTest.i++;
        }
    }