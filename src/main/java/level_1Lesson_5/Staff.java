package level_1Lesson_5;

public class Staff {
    private String fullName;
    private String type; //Должность
    private String email;
    private String tellNumber;
    private int salary;
    private int age;

    public Staff(String fullName, String type, String email, String tellNumber, int salary, int age) {
        this.fullName = fullName;
        this.type = type;
        this.email = email;
        this.tellNumber = tellNumber;
        this.salary = salary;
        this.age = age;
    }

    public Staff() {
        this.fullName = "Иванов Иван Иванович";
        this.type = "manager";
        this.email = "example@mail.com";
        this.tellNumber = "+7 123 456 78 90";
        this.salary = 10000;
        this.age = 25;
    }

    public String getFullName() {
        return fullName;
    }

    public String getType() {
        return type;
    }

    public String getEmail() {
        return email;
    }

    public String getTellNumber() {
        return tellNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void printInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + type);
        System.out.println("E-mail: " + email);
        System.out.println("Тел.: "+ tellNumber);
        System.out.println("Заработная плата: " + salary);
        System.out.println("Возраст: " + age);
    }
}
