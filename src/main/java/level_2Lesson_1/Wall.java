package level_2Lesson_1;

public class Wall extends Challenge{

    private int hightWall;

    public Wall(int hightWall) {
        this.hightWall = hightWall;
    }

    @Override
    public void doOvercome(Sportable sportsman) {
        if (sportsman.getIsAble()) {
            if (sportsman.getMaxJump() >= hightWall) {
                sportsman.jump();
            } else {
                sportsman.notJump();
            }
        }
    }
}
