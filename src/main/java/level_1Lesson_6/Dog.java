package level_1Lesson_6;

public class Dog extends Animals {
    private static int RUN_LIM = 500;
    private static int SWIM_LIM = 10;
    static int count = 0;

    public Dog(String name) {
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
        if (barrier < SWIM_LIM) {
            System.out.println(name + " проплыл " + barrier + " м.");
        } else {
            System.out.println(name + " проплыл всего " + SWIM_LIM + " м.");
        }
    }
    @Override
    public void count() {
        System.out.println("Всего собак: " + count);
    }
}
