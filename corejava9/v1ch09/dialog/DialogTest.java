package dialog;

import java.awt.*;
import javax.swing.*;

/**
 * @author Cay Horstmann
 * @version 1.33 2007-06-12
 */
public class DialogTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new DialogFrame();
                frame.setTitle("DialogTest");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}