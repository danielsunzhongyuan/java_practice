package rasterImage;

import java.awt.*;
import javax.swing.*;

/**
 * This program demonstrates how to build up an image from individual pixels.
 *
 * @author Cay Horstmann
 * @version 1.13 2007-08-16
 */
public class RasterImageTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new RasterImageFrame();
                frame.setTitle("RasterImageTest");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}