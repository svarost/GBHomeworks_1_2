package level_1Lesson_6;

public class Dog extends Animals {
    private int runLim = 500;
    private int swimLim = 10;
    int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
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
        if (barrier < swimLim) {
            System.out.println(name + " проплыл " + barrier + " м.");
        } else {
            System.out.println(name + " проплыл всего " + swimLim + " м.");
        }
    }

    public void count() {
        System.out.println("Всего собак: " + dogCount);
    }
}
