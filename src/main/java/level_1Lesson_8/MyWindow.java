package level_1Lesson_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class MyWindow extends JFrame {
    public MyWindow(char[][] item) {
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        JButton[] buttons = new JButton[16];
        setLayout(new GridLayout(4, 4));
        for (int i = 0; i < item.length; i++) {
            int k = 0;
            for (int j = 0; j < item.length; j++, k++) {
                buttons[k] = new JButton(String.valueOf(item[i][j]));
                add(buttons[k]);
                buttons[k].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("OK");
                    }
                });
                buttons[k].setActionCommand(String.valueOf("buttons[" + k + "]"));
            }
        }


        setVisible(true);
    }
}
