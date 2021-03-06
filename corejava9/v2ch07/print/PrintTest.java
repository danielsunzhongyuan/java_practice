package print;

import java.awt.*;
import javax.swing.*;

/**
 * This program demonstrates how to print 2D graphics
 *
 * @author Cay Horstmann
 * @version 1.12 2007-08-16
 */
public class PrintTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new PrintTestFrame();
                frame.setTitle("PrintTest");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}