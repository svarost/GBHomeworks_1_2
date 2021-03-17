package level_2Lesson_1;

public class Main {
    public static void main(String[] args) {
        Challenge[] challenges = new Challenge[]{new Wall(1),
                                                    new Runway(30),
                                                    new Runway(300),
                                                    new Wall(4)};
        Sportable[] sportables = new Sportable[]{new Human("Валера", 100, 2),
                                                new Cat("Бегемот", 20, 3),
                                                new Robot("Т-1000", 1500, 5)};
        for (Challenge ch: challenges) {
            for (Sportable s: sportables) {
                ch.doOvercome(s);
            }
            System.out.println();
        }
    }
}
