package level_1Lesson_7;

public class Cat {
    private String name;
    private int appetite;
    private boolean isHungry = true;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (appetite <= p.getFood()) {
            p.decreaseFood(appetite);
            appetite = 0;
        }
        hungry();
    }

    public boolean hungry() {
        isHungry = (appetite > 0);
        return isHungry;
    }

    public void info() {
        System.out.print("Кот " + name);
        if (isHungry) {
            System.out.print(" голоден.");
        } else  {
            System.out.print(" сыт.");
        }
        System.out.println();
    }
}
