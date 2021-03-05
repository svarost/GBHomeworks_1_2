package level_1Lesson_6;

public abstract class Animals {
    String name;
    int animalCount = 1;

    public Animals(String name) {
        this.name = name;
        animalCount++;
    }

    public abstract void run(int barrier);
    public abstract void swim(int barrier);

    public void animalsCount() {
        System.out.println("Всего животных: " + animalCount);
    }

}
