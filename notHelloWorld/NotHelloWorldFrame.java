package notHelloWorld;

//import java.awt.*;
import javax.swing.*;

public class NotHelloWorldFrame extends JFrame
{
    public NotHelloWorldFrame()
    {
        add(new NotHelloWorldComponent());
        pack();
    }
}
