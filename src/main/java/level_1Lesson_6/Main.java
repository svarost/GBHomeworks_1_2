package level_1Lesson_6;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Кузя");
        Dog dog1 = new Dog("Байкал");
        Cat cat2 = new Cat("Барсик");
        cat1.run(150);
        cat1.swim(1);
        dog1.run(600);
        dog1.swim(10);
        cat2.run(20);
        cat1.animalsCount();
        dog1.animalsCount();
        dog1.count();
        cat1.count();
    }
}
