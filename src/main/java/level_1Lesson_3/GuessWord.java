package level_1Lesson_3;

import java.util.Random;
import java.util.Scanner;

public class GuessWord {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        //Выбор случайного слова из массива
        Random rand = new Random();
        String guessWord = words[(rand.nextInt(words.length) - 1)];
        Scanner sc = new Scanner(System.in);
        String word1;
        String word2;

        while (true) {
            System.out.println("Введите загаданное слово: ");
            String userWord = sc.nextLine(); // Ввод пользователем загаданного слова
            //Поиск более длинного слова
            if (userWord.length() > guessWord.length()) {
                word1 = guessWord;
                word2 = userWord;
            } else {
                word1 = userWord;
                word2 = guessWord;
            }

            if (userWord.equals(guessWord)) {
                System.out.println("Поздравляю! Вы ответили верно.");
                break;
            } else {
                //Проверка совподения символов в слове
                for (int i = 0; i < word1.length(); i++) {
                    if (word1.charAt(i) == word2.charAt(i)) {
                        System.out.print(word1.charAt(i));
                    } else {
                        System.out.print("#");
                    }
                }
                //Увеличение строки вывода символами "#" до 15
                if (word1.length() < 15) {
                    for (int i = 0; i < (15 - word1.length()); i++) {
                        System.out.print("#");
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
