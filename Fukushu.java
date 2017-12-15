import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fukushu extends JFrame implements ActionListener{

	private JLabel lbl;
   	private JCheckBox jcb;

	public static void main(String[] args) {
		Fukushu fkc = new Fukushu("window");
		fkc.setVisible(true);
	}
	Fukushu(String title){
		setTitle(title);
		setSize(500,500);
		setLocation(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	
		this.jcb =new JCheckBox("チェック");
		this.lbl = new JLabel("Hello");
		JButton jbt = new JButton("ボタン");

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
			panel1.add(jcb);
			panel2.add(jbt);
			panel1.add(lbl);

		jbt.addActionListener(this);

		Container cp = getContentPane();
   		cp.add(panel1,BorderLayout.NORTH);
   		cp.add(panel2,BorderLayout.SOUTH);
	}
	public void actionPerformed(ActionEvent e){
   		if(this.jcb.isSelected()){
   			this.lbl.setText(this.jcb.getText()+"が選択されています。");
   		}else{
   			this.lbl.setText("何も選択されてません。");
   		}
   	}
}