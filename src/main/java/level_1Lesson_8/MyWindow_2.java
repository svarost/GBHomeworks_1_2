package level_1Lesson_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow_2 extends JFrame {
    public MyWindow_2(char[][] item) {

        setTitle("TicTakToe");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(1300, 300, 400, 400);
        JButton[] buttons = new JButton[9];
        setLayout(new GridLayout(3, 3));
        for (int i = 0; i < item.length; i++) {
            int k = 0;
            for (int j = 0; j < item.length; j++, k++) {
                buttons[k] = new JButton(String.valueOf(item[i][j]));
                add(buttons[k]);
                buttons[k].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("OK");
                        if (MainClass.map[0][0] == MainClass.EMPTY_DOT) {
                            MainClass.map[0][0] = MainClass.X_DOT;
                            etLabel(String.valueOf(MainClass.X_DOT));
                            buttons[k] = 0;
                            System.out.println(MainClass.map[0][0]);
                        }
                    }
                });
                buttons[k].setActionCommand(String.valueOf("buttons[" + k + "]"));
            }
        }


        setVisible(true);
    }
}
