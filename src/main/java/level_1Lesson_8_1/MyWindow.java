package level_1Lesson_8_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class MyWindow extends JFrame implements ActionListener {
    private static final char X_DOT = 'X';
    private static final char O_DOT = 'O';

    private MyTicTacToe logic;

    private final JButton[][] buttons = new JButton[3][3];

    public MyWindow(MyTicTacToe logic) {
        this.logic = logic;

        setTitle("Tic Tak Game!");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        setLayout(new GridLayout(3, 3));

        logic.initMap();


        for (int y = 0; y < logic.getMap().length; y++) {
            for (int x = 0; x < logic.getMap().length; x++) {
                buttons[x][y] = new JButton(String.valueOf(logic.getMap()[x][y]));
                add(buttons[x][y]);
                buttons[x][y].addActionListener(this);
                buttons[x][y].setActionCommand(x+"_"+y);
            }
        }
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String c = e.getActionCommand();
        String[] commands = c.split("_");
        try {
            int x = Integer.parseInt(commands[0]);
            int y = Integer.parseInt(commands[1]);
//            System.out.println(x + " " + y);
            buttons[x][y].setText("X");
            buttons[x][y].setEnabled(false);
            logic.humanTurn(x, y);
        } catch (NumberFormatException ex){
//            System.out.println(ex.getMessage());
        }

//        logic.printMap();

        checkWinner();

    }

    private void checkWinner() {
        if (logic.checkWin(X_DOT)) {
            setTitle("Вы победили!");
            endGame();
            return;
        } else if (logic.checkDraw()) {
            setTitle("Ничья.");
        }

        Step s = logic.computerTurn();
        showComputerTurn(s);

        if (logic.checkWin(O_DOT)) {
            setTitle("Вы проиграли.");
            endGame();
        } else if (logic.checkDraw()) {
            setTitle("Ничья.");
        }
    }

    private void endGame(){
        setTitle(getTitle() + " Игра окончена!");
        for (int y = 0; y < logic.getMap().length; y++) {
            for (int x = 0; x < logic.getMap().length; x++) {
                buttons[x][y].setEnabled(false);
            }
        }
    }

    private void showComputerTurn(Step step){
        buttons[step.getX()][step.getY()].setText(String.valueOf(O_DOT));
        buttons[step.getX()][step.getY()].setEnabled(false);
//        logic.printMap();
    }
}
