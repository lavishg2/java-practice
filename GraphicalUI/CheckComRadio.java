import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class CheckComRadio {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Main Frame");
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        JLabel l1=new JLabel("Which Language you want to choose.");
        l1.setBounds(50,50,250,30);
        frame.add(l1);
        JCheckBox chkbox1=new JCheckBox("C++");
        chkbox1.setBounds(50,80,50,30);
        frame.add(chkbox1);
        JCheckBox chkbox2=new JCheckBox("Java");
        chkbox2.setBounds(50,110,70,30);
        frame.add(chkbox2);
        JRadioButton rb1=new JRadioButton("Python");
        rb1.setBounds(50,130,80,30);
        frame.add(rb1);
        JRadioButton rb2=new JRadioButton("JavaScript");
        rb2.setBounds(50,150,100,30);
        frame.add(rb2);
        String data[]={"C++","Java","JavaScript","HTML"};
        JComboBox combox1=new JComboBox(data);
        combox1.setBounds(50,180,80,30);
        frame.add(combox1);
}
}