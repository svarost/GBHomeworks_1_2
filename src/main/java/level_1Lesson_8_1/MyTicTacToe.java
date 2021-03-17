package level_1Lesson_8_1;
import java.util.Random;

public class MyTicTacToe {
    private char [][] map;
    static int SIZE = 3;
    private final char EMPTY_DOT = '•';
    private final char X_DOT = 'X';
    private final char O_DOT = 'O';
    private int COUNT_CHIP = 3;

    public char[][] getMap() {
        return map;
    }

    public boolean checkDraw() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == EMPTY_DOT) {
                    return false;
                }
            }
        }
        return true;
    }

    public Step computerTurn() {
        int xCoordinate;
        int yCoordinate;
        do {
            Random random = new Random();
            xCoordinate = random.nextInt(SIZE);
            yCoordinate = random.nextInt(SIZE);
        } while (!isValidCell(xCoordinate, yCoordinate));
        map[yCoordinate][xCoordinate] = O_DOT;
        return new Step(xCoordinate, yCoordinate);
    }

    public boolean checkWin(char aChar) {
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

    public void humanTurn(int x, int y) {
        map[y][x] = X_DOT;
    }

    public boolean isValidCell(int x, int y) {
        if (x < 0 || x > SIZE - 1 || y < 0 || y > SIZE - 1) {
            return false;
        }
        return (map[y][x] == EMPTY_DOT);
    }

    public void printMap() {
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

    public void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = EMPTY_DOT;
            }
        }
    }
}



