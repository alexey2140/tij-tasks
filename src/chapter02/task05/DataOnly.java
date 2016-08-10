package chapter02.task05;

public class DataOnly
{
    int i = 1;
    double d = 0.1d;
    boolean b = true;

    public static void main(String[] args) {
        DataOnly data = new DataOnly();
        System.out.println(data.i);
        System.out.println(data.d);
        System.out.println(data.b);
    }
}