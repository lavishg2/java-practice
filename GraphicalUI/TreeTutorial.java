
import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeTutorial {
    public static void main(String[] args) {
        JFrame frame=new  JFrame();
        frame.setSize(400,400);
        frame.setVisible(true);
        DefaultMutableTreeNode style=new  DefaultMutableTreeNode("Style");
        DefaultMutableTreeNode color=new  DefaultMutableTreeNode("Color");
        DefaultMutableTreeNode font=new   DefaultMutableTreeNode("Font");
        style.add(color);
        style.add(font);
        DefaultMutableTreeNode red=new  DefaultMutableTreeNode("Red");
        DefaultMutableTreeNode green=new  DefaultMutableTreeNode("Green");
        DefaultMutableTreeNode blue=new  DefaultMutableTreeNode("Blue");
        DefaultMutableTreeNode white=new  DefaultMutableTreeNode("White");
        color.add(red);
        color.add(green);
        color.add(blue);
        color.add(white);
        JTree jt=new JTree(style);
        frame.add(jt);
    }
}
