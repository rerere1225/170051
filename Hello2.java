import javax.swing.JFrame;
import java.awt.Container;
import java.awt.BorderLayout;

public class Hello2 extends JFrame{

	Hello2(String title){
		setTitle(title);
		setSize(600,600);
		setLocation(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}
	public static void main(String[] args) {
		Hello2 hello = new Hello2("Hello");
		hello.setVisible(true);
	}
}