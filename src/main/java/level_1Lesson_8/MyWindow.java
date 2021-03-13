package level_1Lesson_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class MyWindow extends JFrame {
    private static final char EMPTY_DOT = '•';
    private static final char X_DOT = 'X';
    private static final char O_DOT = 'O';

    public MyWindow(char[][] item) {
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        setLayout(new GridLayout(3, 3));
        JButton butt_1 = new JButton(String.valueOf(item[0][0]));
        add(butt_1);
        butt_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (MainClass.map[0][0] == EMPTY_DOT) {
                    MainClass.map[0][0] = X_DOT;
                    butt_1.setLabel(String.valueOf(X_DOT));
                    System.out.println(MainClass.map[0][0]);
                    butt_1.enable(false);
                }
            }
        });


        JButton butt_2 = new JButton(String.valueOf(item[1][0]));
        add(butt_2);
        JButton butt_3 = new JButton(String.valueOf(item[2][0]));
        add(butt_3);
        JButton butt_4 = new JButton(String.valueOf(item[0][1]));
        add(butt_4);
        JButton butt_5 = new JButton(String.valueOf(item[1][1]));
        add(butt_5);
        JButton butt_6 = new JButton(String.valueOf(item[2][1]));
        add(butt_6);
        JButton butt_7 = new JButton(String.valueOf(item[0][2]));
        add(butt_7);
        JButton butt_8 = new JButton(String.valueOf(item[1][2]));
        add(butt_8);
        JButton butt_9 = new JButton(String.valueOf(item[2][2]));
        add(butt_9);













//        for (int i = 0; i < item.length; i++) {
//            int k = 0;
//            for (int j = 0; j < item.length; j++, k++) {
//                buttons[k] = new JButton(String.valueOf(item[i][j]));
//                add(buttons[k]);
//                buttons[k].addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        System.out.println("OK");
//                    }
//                });
//                buttons[k].setActionCommand(String.valueOf("buttons[" + k + "]"));
//            }
//        }


        setVisible(true);
    }
}
