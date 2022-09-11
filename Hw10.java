import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Hw10
{  public static void main(String[] args) {
    JFrame frame = new JFrame();

    frame.setSize(200, 200);
    JLabel label = new JLabel("Hello, World!");
    frame.setSize(400, 400);
    label.setText("Hello,lamees");
    label.setOpaque(true);
    label.setBackground(Color.PINK);
    label.setBackground(new Color(0x008202));
    frame.add(label);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true); } }