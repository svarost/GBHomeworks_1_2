package level_2Lesson_1;

public class Human implements Sportable {
    private String name;
    private int maxRun;
    private int maxJump;
    private boolean isAbl = true;

    public Human(String name, int maxRun, int maxJump) {
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
        System.out.println("Человек " + name + " перепрыгнул через стену.");
    }

    @Override
    public void notJump() {
        System.out.println("Человек " + name + " не смог прыгнуть через стену.");
        isAbl = false;
    }

    @Override
    public void run() {
        System.out.println("Человек " + name + " пробежал дорожку полностью.");
    }

    @Override
    public void notRun() {
        System.out.println("Человек " + name + " не смог пробежать дорожку полностью.");
        isAbl = false;
    }
}
