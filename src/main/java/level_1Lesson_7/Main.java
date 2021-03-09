package level_1Lesson_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Plate plate = new Plate(220);
        Cat[] cats = new Cat[]{
            new Cat("Мурзик", 26),
            new Cat("Персик", 500),
            new Cat("Борис", 12)
        };
        while (true) {
            for (int i = 0; i < cats.length; i++) {
                cats[i].eat(plate);
            }
            for (int i = 0; i < cats.length; i++) {
                cats[i].info();
            }
            System.out.println("Добавить еды в тарелку? Да - 1, нет - 2: ");
            int in = sc.nextInt();
            if (in == 1 ) {
                System.out.println("Введите количество еды, которую необходимо добавить в тарелку: ");
                plate.increaseFood(sc.nextInt());
            } else {
                break;
            }
        }
    }
}
