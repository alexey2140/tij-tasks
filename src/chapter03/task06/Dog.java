package chapter03.task06;

public class Dog {
    String name;
    String says;

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = dog1;

        dog1.name = "spot";
        dog1.says = "woofWoof!!";

        dog2.name = "scruffy";
        dog2.says = "waaaaw!!";

        System.out.println("Dog: " + dog1.name + " and he Says: " + dog1.says);
        System.out.println("Dog: " + dog2.name + " and he Says: " + dog2.says);

        System.out.println(dog1 == dog3);
        System.out.println(dog1.equals(dog3));
    }
}