package Lesson4;

import javax.swing.*;

public class Game extends JPanel {
    public Game(){
        Keyboard keyboard = new Keyboard();
        addKeyListener(keyboard);
        setFocusable(true);
        JFrame jFrame = new JFrame();
        jFrame.add(this);
        jFrame.setSize(200,200);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
