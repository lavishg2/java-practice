
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBarItem {
    public static void main(String[] args) {
        JFrame frame= new JFrame("Main Frame");
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        JMenuBar mb=new JMenuBar();
        JMenu menu, submenu;
        JMenuItem i1,i2,i3,i4,i5;
        menu = new JMenu("Menu");
        submenu=new JMenu("Submenu");
        i1=new JMenuItem("Item1");
        i2=new JMenuItem("Item2");
        i3=new JMenuItem("Item3");
        i4=new JMenuItem("Item4");
        i5=new JMenuItem("Item5");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        menu.add(submenu);
        mb.add(menu);
        frame.setJMenuBar(mb);
    }
}
