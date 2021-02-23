package level_1Lesson_3;

import java.util.Scanner;

public class HomeTaskPractice {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            guessNumber();
            System.out.println();
            System.out.println("Повторить игру еще раз? 1 - да / 0 - нет.");
            int answer = sc.nextInt();
            if (answer == 0) {
                break;
            }
        }
        sc.close();
    }

    public static void guessNumber() {
        int randomNum = (int) (Math.random() * 10);
        int x;
        int count = 0;
        for (int i = 0;; i++) {
            System.out.println("Осталось " + (3 - count) + " попытки. Введите загаданное число (от 0 до 9): ");
            if (sc.hasNextInt()) {
                x = sc.nextInt();
                count ++;
            } else  {
                sc.nextLine();
                continue;
            }
            sc.nextLine();
            if (x == randomNum) {
                System.out.println("Поздравляю! Вы угадали!");
                break;
            } else if (randomNum > x) {
                System.out.println("Загаданное число больше введенного.");
            } else {
                System.out.println("Загаданное число меньше введенного.");
            }
            if (count == 3) {
                System.out.println("Вы проиграли.");
                break;
            }
        }
    }
}
