package level_2Lesson_1;

public class Cat implements Sportable {
    private String name;
    private int maxRun;
    private int maxJump;
    private boolean isAbl = true;

    public Cat(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public int getMaxRun() {
        return maxRun;
    }

    @Override
    public int getMaxJump() {
        return maxJump;
    }

    @Override
    public boolean getIsAble() {
        return isAbl;
    }

    @Override
    public void jump() {
        System.out.println("Кошка " + name + " перепрыгнула через стену.");
    }

    @Override
    public void notJump() {
        System.out.println("Кошка " + name + " не смогла прыгнуть через стену.");
        isAbl = false;
    }

    @Override
    public void run() {
        System.out.println("Кошка " + name + " пробежала дорожку полностью.");
    }

    @Override
    public void notRun() {
        System.out.println("Кошка " + name + " не смогла пробежать дорожку полностью.");
        isAbl = false;
    }
}
