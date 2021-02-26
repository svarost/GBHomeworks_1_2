package level_1Lesson_4;
import java.util.Random;
import java.util.Scanner;

public class MyTicTacToe {
    private static char [][] map;
    private static int SIZE;
    private static final char EMPTY_DOT = '•';
    private static final char X_DOT = 'X';
    private static final char O_DOT = 'O';
    private static int COUNT_CHIP;
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        while (true){
            System.out.println("Введите размерность поля: ");
            if (sc.hasNextInt()) {
                SIZE = sc.nextInt();
                break;
            }
            sc.nextLine();
        }
        while (true){
            System.out.println("Укажите количество фишек для победы: ");
            if (sc.hasNextInt()) {
                COUNT_CHIP = sc.nextInt();
                break;
            }
            sc.nextLine();
        }
        initMap(SIZE);
        printMap(SIZE);
        while (true){
            humanTurn();
            printMap(SIZE);
            if (checkWin(X_DOT)) {
                System.out.println("Вы победили!");
                break;
            }
            computerTurn();
            printMap(SIZE);
            if (checkWin(O_DOT)) {
                System.out.println("Вы проиграли.");
                break;
            }
            if (checkDraw()) {
                System.out.println("Ничья.");
                break;
            }
        }
        sc.close();
    }

    private static boolean checkDraw() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == EMPTY_DOT) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void computerTurn() {
        int xCoordinate;
        int yCoordinate;
        do {
            Random random = new Random();
            xCoordinate = random.nextInt(SIZE);
            yCoordinate = random.nextInt(SIZE);
        } while (!isValidCell(xCoordinate, yCoordinate));
        map[yCoordinate][xCoordinate] = O_DOT;
    }

    private static boolean checkWin(char aChar) {
        int chipHorizon = 0;
        int chipVertical = 0;
        int backSlash = 0;
        int slash = 0;
        int topBackSlash = 0;
        int bottomBackSlash = 0;
        int topSlash = 0;
        int bottomSlash = 0;
        for (int i = 0; i < SIZE; i++) {
            // Проверка центральных диагоналей
            if (map[i][i] == aChar) {
                backSlash++;
            } else {
                backSlash = 0;
            }
            if (map[SIZE - 1 - i][i] == aChar) {
                slash++;
            } else {
                slash = 0;
            }
            if (backSlash == COUNT_CHIP || slash == COUNT_CHIP) {
                return true;
            }
            //Проверка по горизонтали и вертикали
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == aChar) {
                    chipHorizon++;
                } else {
                    chipHorizon = 0;
                }
                if (map[j][i] == aChar) {
                    chipVertical++;
                } else {
                    chipVertical = 0;
                }
                if (chipHorizon == COUNT_CHIP || chipVertical == COUNT_CHIP) {
                    return true;
                }
                // Проверка малых диагоналей
                if (!(i + j + 1 > SIZE - 1)) {
                    if (map[i + j + 1][j] == aChar) {
                        topBackSlash++;
                    } else {
                        topBackSlash = 0;
                    }
                    if (map[j][i + j + 1] == aChar) {
                        bottomBackSlash++;
                    } else {
                        bottomBackSlash = 0;
                    }
                }
                if (SIZE - 2 - i - j > 0) {
                    if (map[SIZE - 2 - i - j][j] == aChar) {
                        topSlash++;
                    } else
                    {
                        topSlash = 0;
                    }
                }
                if (i + j + 1 < SIZE) {
                    if (map[SIZE - 1 - j][i + j + 1] == aChar){
                        bottomSlash++;
                    } else {
                        bottomSlash = 0;
                    }
                }
                if (topBackSlash == COUNT_CHIP || bottomBackSlash == COUNT_CHIP || topSlash == COUNT_CHIP || bottomSlash == COUNT_CHIP) {
                    return true;
                }
            }
            chipHorizon = 0;
            chipVertical = 0;
        }
        return false;
    }

    private static void humanTurn() {
        sc = new Scanner(System.in);
        int xCoordinate = -1;
        int yCoordinate = -1;
        do {
            System.out.println("Введите координаты в формате X и Y: ");
            if (sc.hasNextInt()) {
                xCoordinate = sc.nextInt() - 1;
            }
            if (sc.hasNextInt()) {
                yCoordinate = sc.nextInt() - 1;
            }
            sc.nextLine();
        } while (!isValidCell(xCoordinate, yCoordinate));
        map[yCoordinate][xCoordinate] = X_DOT;
    }

    private static boolean isValidCell(int x, int y) {
        if (x < 0 || x > SIZE - 1 || y < 0 || y > SIZE - 1) {
            return false;
        }
        return (map[y][x] == EMPTY_DOT);
    }

    private static void printMap(int size) {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    private static void initMap(int size) {
        map = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = EMPTY_DOT;
            }
        }
    }
}



