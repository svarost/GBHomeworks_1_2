package level_1Lesson_6;

public abstract class Animals {
    String name;
    private static int count = 0;

    public Animals(String name) {
        this.name = name;
        this.count++;
    }

    public abstract void run(int barrier);
    public abstract void swim(int barrier);

    public void count() {
        System.out.println("Всего животных: " + count);
    }

}
