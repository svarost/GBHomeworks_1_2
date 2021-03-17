package level_1Lesson_8_1;

public class MainClass {

    public static void main(String[] args) {
        MyTicTacToe logic = new MyTicTacToe();
        logic.initMap();
        MyWindow myWindow = new MyWindow(logic);
    }

}
