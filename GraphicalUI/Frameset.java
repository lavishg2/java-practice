import java.lang.classfile.Label;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frameset {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Main Frame");
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        JLabel l1=new JLabel("click the button");
        l1.setBounds(105,75,150,30);
        frame.add(l1);
        JButton b1=new JButton("click1");
        b1.setBounds(200,200,100,50);
        frame.add(b1);
        JButton b2=new JButton(new ImageIcon ("C:\\Users\\lenovo\\Downloads\\Untitled.png"));
        b2.setBounds(100,100,100,50);
        frame.add(b2);
    }
}
