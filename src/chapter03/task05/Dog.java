package chapter03.task05;

public class Dog {
    String name;
    String says;

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.name = "spot";
        dog1.says = "woofWoof!!";

        dog2.name = "scruffy";
        dog2.says = "waaaaw!!";

        System.out.println("Dog: " + dog1.name + " and he Says: " + dog1.says);
        System.out.println("Dog: " + dog2.name + " and he Says: " + dog2.says);
    }
}