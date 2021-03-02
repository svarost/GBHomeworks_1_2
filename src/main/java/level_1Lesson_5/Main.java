package level_1Lesson_5;

public class Main {
    public static void main(String[] args) {
        Staff[] staff = new Staff[5];
        staff[0] = new Staff("Краснов Егор Петрович", "инженер", "kras@mail.com",
                "89093334477", 21000, 45);
        staff[1] = new Staff("Петров Степан Петрович", "менеджер", "petr@mail.com",
                "89093334477", 32500, 44);
        staff[2] = new Staff("Семенов Иван Михайлович", "директор", "sem@mail.com",
                "89093334477", 69000, 65);
        staff[3] = new Staff("Соров Петр Петрович", "сантехник", "sorov@mail.com",
                "89093334477", 54678, 19);
        staff[4] = new Staff("Губериниев Артём фёдорович", "старший инженер", "guber@mail.com",
                "89093334477", 16980, 21);

        for (int i = 0; i < staff.length; i++) {
            if(staff[i].getAge() > 40) {
                staff[i].printInfo();
                System.out.println();
            }
        }
    }
}
