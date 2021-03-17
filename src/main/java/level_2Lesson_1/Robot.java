package level_2Lesson_1;

public class Robot implements Sportable{
    private String name;
    private int maxRun;
    private int maxJump;
    private boolean isAbl = true;

    public Robot(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public void jump() {
        System.out.println("Робот " + name + " перепрыгнул через стену.");
    }

    @Override
    public void notJump() {
        System.out.println("Робот " + name + " не смог прыгнуть через стену.");
        isAbl = false;
    }

    @Override
    public void run() {
        System.out.println("Робок " + name + " пробежал дорожку полностью.");
    }

    @Override
    public void notRun() {
        System.out.println("Робот " + name + " не смог пробежать дорожку полностью.");
        isAbl = false;
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
}
