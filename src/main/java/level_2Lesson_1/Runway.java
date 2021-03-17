package level_2Lesson_1;

public class Runway extends Challenge{
    private int lengthRunway;

    public Runway(int lengthRunway) {
        this.lengthRunway = lengthRunway;
    }

    @Override
    public void doOvercome(Sportable sportsman) {
        if (sportsman.getIsAble()) {
            if (sportsman.getMaxRun() >= lengthRunway) {
                sportsman.run();
            } else {
                sportsman.notRun();
            }
        }
    }
}
