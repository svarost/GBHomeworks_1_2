package level_1Lesson_6;

public class Cat extends Animals {
    private final int RUN_LIM = 200;
    static int count = 0;

    public Cat(String name) {
        super(name);
        count++;
    }

    @Override
    public void run(int barrier) {
        if (barrier < RUN_LIM) {
            System.out.println(name + " пробежал " + barrier + " м.");
        } else {
            System.out.println(name + " пробежал всего " + RUN_LIM + " м.");
        }
    }

    @Override
    public void swim(int barrier) {
        System.out.println("Коты не умеют плавать.");
    }

    public void count() {
        System.out.println("Всего кошек: " + count);
    }

    @Override
    public void countAnimal() {
        super.countAnimal();
    }
}
