public class HomeTask {
    public static void main(String[] args) {

    //2. Создание переменных всех типов
        byte b = 55;
        short sh = 22;
        int i = 123;
        long l = 777L;

        float f = 3.4f;
        double d = 34.76;

        char c = 'V';

        boolean bool = false;

        String str = "In the beginning it was";

        //System.out.println(test_6(2));
        year(1000);


    }
    // 3. Метод подсчета выражения: a * (b + (c / d))
    public static float calc(float a, float b, float c, float d) {
        float rez = a * (b + (c /d));
        return rez;
    }

    // 4. Сумма двух целых числе лижет в пределах от 10 до 20
    public static boolean test_4(int a, int b) {
        if ((a + b) >= 10 && ((a + b) <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    // 5. Проверка целого числа на положительное/отрицательное с выводом сообщения в консоль
    public static void test_5(int num) {
        if (num >= 0) {
            System.out.println("Число положительное.");
        } else {
            System.out.println("Число отрицательное.");
        }
    }

    //6. Проверка целого числа на положительное/отрицательное и возвратом false или true
    public static boolean test_6(int num) {
        if (num >= 0) {
            return false;
        } else {
            return true;
        }
    }

    //7. Вывод приветствия с именем
    public static void hello(String name) {
        System.out.println("Привет, " + name + "!");
    }

    // 8.* Определение високосного года
    public static void year(int y) {
        if ((y % 400) == 0) {
            System.out.println("Год високосный.");
        } else if ((y % 100) == 0) {
            System.out.println("Год невисоконый.");
        } else  if ((y % 4) == 0) {
            System.out.println("Год високосный.");
        } else {
            System.out.println("Год невисоконый.");
        }
    }
}
