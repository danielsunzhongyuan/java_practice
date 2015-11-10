package notHelloWorld;

import java.awt.*;
import javax.swing.*;

public class NotHelloWorld
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
            {
                public void run()
                {
                    JFrame frame = new NotHelloWorldFrame();
                    frame.setTitle("Not Hello World");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                }
            });
    }
}
