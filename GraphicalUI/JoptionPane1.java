
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JoptionPane1 {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Main Frame");
        String name=JOptionPane.showInputDialog(frame,"Enter your Name");
        System.out.println(name);
        JOptionPane.showMessageDialog(frame, name,"Alert",JOptionPane.WARNING_MESSAGE);

    }
}