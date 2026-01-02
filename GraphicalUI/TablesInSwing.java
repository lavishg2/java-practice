import javax.swing.JFrame;
import javax.swing.JTable;

public class TablesInSwing {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Main Frame");
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        String columns[]={"ID", "Name", "salary"};
        String data[][]={{"101", "lavish", "50000"},
                        {"102", "lakhvinder", "70000"},
                        {"103", "nannu","80000"}};
        JTable tbl1=new JTable(data,columns);
        tbl1.setBounds(200,200,300,70);
        frame.add(tbl1);
    }
}
