package level_1Lesson_6;

public class Cat extends Animals {
    private int runLim = 200;
    int catCount = 0;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void run(int barrier) {
        if (barrier < runLim) {
            System.out.println(name + " пробежал " + barrier + " м.");
        } else {
            System.out.println(name + " пробежал всего " + runLim + " м.");
        }
    }

    @Override
    public void swim(int barrier) {
        System.out.println("Коты не умеют плавать.");
    }

    public void count() {
        System.out.println("Всего кошек: " + catCount);
    }
}
