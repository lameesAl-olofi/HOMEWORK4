import javax.swing.*;
import java.awt.*;

class TwoSquareComponent extends JComponent {
    public void paintComponent (Graphics g )
    {
        Rectangle r=new Rectangle(150,50,200,100);
        Rectangle r2=new Rectangle(150,200,200,100);
        Graphics2D g2=(Graphics2D)g;
        g2.setColor(Color.pink);
        g2.fill(r);
        g2.setColor(new Color(0xB263E7));
        g2.fill(r2);

    }
}