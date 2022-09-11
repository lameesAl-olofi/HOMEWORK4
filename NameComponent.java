import javax.swing.*;
import java.awt.*;

public class NameComponent extends JComponent {
    public void paintComponent (Graphics g )
    {
        Rectangle r=new Rectangle(150,50,200,100);
        Graphics2D g2=(Graphics2D)g;
        g2.setColor(Color.blue);
        g2.fill(r);
        g2.drawString("lamees",90,80);

    }
}