import javax.swing.*;

public class HW9 {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(500,500);
        frame.setTitle(" traffic  ");
        TrafficComponent component1=new  TrafficComponent();
        frame.add(component1);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
