import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;//選べる選択肢をひとつだけにする
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelloJRadioButton extends JFrame implements ActionListener{
	private JLabel lbl;
	private JRadioButton jrb1;
	private JRadioButton jrb2;
	private JRadioButton jrb3;

	HelloJRadioButton(String title){
		setTitle(title);
		setSize(500,500);
		setLocation(300,300);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    	JButton btn = new JButton("クリック");
    	btn.addActionListener(this);

    	this.lbl = new JLabel("らべる");

    	this.jrb1 = new JRadioButton("らじお１");
    	this.jrb2 = new JRadioButton("らじお2");
    	this.jrb3 = new JRadioButton("らじお3");

    	JPanel pnl = new JPanel();
    	pnl.setLayout(new GridLayout(5,1));

    	pnl.add(this.lbl);

    	pnl.add(btn);

    	pnl.add(this.jrb1);
    	pnl.add(this.jrb2);
    	pnl.add(this.jrb3);

    	ButtonGroup bg = new ButtonGroup();
    	bg.add(this.jrb1);
    	bg.add(this.jrb2);
    	bg.add(this.jrb3);


    	Container cp = getContentPane();
    	cp.add(pnl,BorderLayout.NORTH);


	}

	public void actionPerformed(ActionEvent e){
		Boolean kekka1 = this.jrb1.isSelected();
  		Boolean kekka2 = this.jrb2.isSelected();
  		Boolean kekka3 = this.jrb3.isSelected(); 

  		 String msg = "";
  		 if(kekka1){
  		 	msg=this.jrb1.getText()+"が選択されています";
  		 	this.lbl.setText(msg);
  		 }
  		 if(kekka2){
  		 	msg=this.jrb2.getText()+"が選択されています";
  		 	this.lbl.setText(msg);
  		 }
  		 if(kekka3){
  		 	msg=this.jrb3.getText()+"が選択されています";
  		 	this.lbl.setText(msg);
  		 }
	}
	

	public static void main(String[] args) {
		HelloJRadioButton frame = new HelloJRadioButton("Hello");
		frame.setVisible(true);
	}
}