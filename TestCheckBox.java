import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import java.awt.Container;
import java.awt.BorderLayout;

public class TestCheckBox extends JFrame{
	TestCheckBox(String title){
		setTitle(title);
      	setSize(500,500);
     	setLocation(500,500);
       	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       	JCheckBox check1 = new JCheckBox("勝田");


       	JPanel panel = new JPanel();

       	panel.add(check1);

       	Container cp = getContentPane();
        cp.add(panel,BorderLayout.NORTH); 
    }
    public static void main(String args[]){
     	TestCheckBox tcb = new TestCheckBox("Window");
       	tcb.setVisible(true);
    }
}