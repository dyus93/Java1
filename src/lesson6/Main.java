package lesson6;

public class Main {
    public static void main(String[] args) {


        Cat cat = new Cat("Кот", "Васька", 20, 200, 0);
        Dog dog = new Dog("Собака", "Барбос", 5, 500, 10);

        dog.run(150);
        dog.swim(5);
        dog.jump(10);
        cat.run(150);
        cat.jump(10);
        cat.swim(50);
    }
}