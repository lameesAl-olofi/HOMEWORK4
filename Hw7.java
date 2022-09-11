import javax.swing.*;
import java.awt.*;

public class Hw7 {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(500,500);
        frame.setTitle("TwoSquareViewer ");
        TwoSquareComponent component=new TwoSquareComponent();
        frame.add(component);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
