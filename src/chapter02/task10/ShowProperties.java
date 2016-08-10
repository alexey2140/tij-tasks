package chapter02.task10;


public class ShowProperties {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
} ///:~
