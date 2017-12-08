import javax.swing.*;
import java.awt.*;

public class TestJPasswordField extends JFrame{
	
	
	TestJPasswordField(String title){
   		setTitle(title);
   		setSize(600,600);
   		setLocation(0,0);
   		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   		
   		JPanel pnl = new JPanel();
   
     	//JPasswordField jpf = new JPasswordField("ALOHA",20);
       
     	pnl.add(jp,BorderLayout.NORTH);
   
   		Container cp = getContentPane();
   		cp.add(pnl,BorderLayout.NORTH);
   	}
   	public static void main(String args[]){
     		UserReg window = new UserReg("Window");
       		window.setVisible(true);
    }
}