package level_1Lesson_2;

public class HomeTaskArray {
    public static void main(String[] args) {

        //Task 1
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                arr1[i] = 1;
            } else {
                arr1[i] = 0;
            }
        }

        //Task 2
        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
        }

        //Task 3
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }

        //Task 4
        int[][] arr4 = new int[7][7];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i][arr4.length - 1 - i] = 1;
            arr4[i][i] = 1;
        }

        //Task 5
        int[] arr5 = {10, 5, 30, 2, 11, 488, 556, 92, 4, 8, 0, 1};
        int minArr5 = arr5[0];
        int maxArr5 = arr5[0];
        for (int i = 1; i < arr5.length; i++) {
            if (arr5[i] > maxArr5) {
                maxArr5 = arr5[i];
            }
            if (arr5[i] < minArr5) {
                minArr5 = arr5[i];
            }
        }
    }

    //Task 6
    public static boolean checkBalance(int[] arr) {
        int sum = 0;
        int sum1 = 0;
        boolean bool = false;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i];
            if (sum / 2 == sum1 && sum % 2 == 0) {
                bool = true;
                break;
            }
            if (sum / 2 < sum1) {
                bool = false;
                break;
            }
        }
        return bool;
    }

    //Task 7
    public static void offsetArray(int[] arr, int stp) {
        if (stp > 0) {
            for (int i = 0; i < stp; i++) {
                int buf = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = buf;
            }
        } else {
            for (int i = 0; i > stp; i--) {
                int buf = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = buf;
            }
        }
    }
}

