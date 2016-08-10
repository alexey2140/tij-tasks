package chapter05.task05;

public class Dog {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark(1);
        dog.bark(2, "Голос");
        dog.bark("Волк");
    }

    public void bark(int a) {
        System.out.println("Один хлопок - собака лает");
    }

    public void bark(int a, String s) {
        System.out.println("Два хлопка и команда (голос) - собака скулит");
    }

    public void bark(String s) {
        System.out.println("Команда (волк) - собака завывает");
    }
}