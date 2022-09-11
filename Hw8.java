import javax.swing.*;

public class Hw8 {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(500,500);
        frame.setTitle("NameViewer  ");
        NameComponent component1=new NameComponent();
        frame.add(component1);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
