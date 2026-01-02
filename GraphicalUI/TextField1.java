
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextField1 {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Main Frame");
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        JTextField t1=new JTextField("username");
        t1.setBounds(100,100,100,30);
        frame.add(t1);
        JPasswordField p1=new JPasswordField();
        p1.setBounds(100,140,100,30);
        frame.add(p1);
        JTextArea ta1=new JTextArea("Tell something about yourself");
        ta1.setBounds(100,180,200,100);
        frame.add(ta1);

    }
}
