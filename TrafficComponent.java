import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;


public class TrafficComponent extends JComponent {
    public void paintComponent (Graphics g )
        {
            Rectangle r=new Rectangle(150,50,200,100);
            Graphics2D g2=(Graphics2D)g;
            g2.setColor(Color.black);
            g2.fill(r);
            Ellipse2D.Double r2=new Ellipse2D.Double(200,150,300,350);
            g2.setColor(Color.red);
            g2.fill(r2);
            Ellipse2D.Double r3=new Ellipse2D.Double(200,150,300,350);
            g2.setColor(Color.yellow);
            g2.fill(r3);
            Ellipse2D.Double r4=new Ellipse2D.Double(200,150,300,350);
            g2.setColor(Color.green);
            g2.fill(r4);




        }
    }

