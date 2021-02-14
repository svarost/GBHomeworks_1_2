package level_1Lesson_3;

import java.util.Scanner;

public class HomeTaskPractice {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            guessNumber();
            System.out.println();
            System.out.println("Повторить игру еще раз? 1- да / 0 - нет.");
            int answer = sc.nextInt();
            if (answer == 1) {
                continue;
            } else {
                break;
            }

        }
    }

    public static void guessNumber() {
        int randomNum = (int) (Math.random() * 10);
        for (int i = 0; i < 3; i++) {
            System.out.println("Осталось " + (3 - i) + " попытки. Введите загаданное число: ");
            int x = sc.nextInt();
            if (x == randomNum) {
                System.out.println("Поздравляю! Вы угадали!");
                break;
            } else if (randomNum > x) {
                System.out.println("Загаданное число больше введенного.");
            } else {
                System.out.println("Загаданное число меньше введенного.");
            }
            if (i == 2) {
                System.out.println("Вы проиграли.");
            }

        }
//        System.out.println(randomNum);
    }
}
