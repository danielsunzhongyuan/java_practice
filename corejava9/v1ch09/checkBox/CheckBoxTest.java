package checkBox;

import java.awt.*;
import javax.swing.*;

/**
 * @author Cay Horstmann
 * @version 1.33 2007-06-12
 */
public class CheckBoxTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new CheckBoxFrame();
                frame.setTitle("CheckBoxTest");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

