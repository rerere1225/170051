//チェックボックスを3個作る
//それを縦に並べる
//さっき作ったウィンドウ(JFrame)に、JLabelとJButtonを追加する
//ボタンをclickしたら、チェックボックスを確認する
//3つのボタンの状況を、JLabelに書き込む

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;//チェックBOXを縦に並ばせる
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelloCheckBox extends JFrame implements ActionListener{
	JLabel[] lbl;
	JCheckBox[] check;

	public static void main(String[] args) {
    HelloCheckBox hcb = new HelloCheckBox("Window");
    hcb.setVisible(true);
	}

	HelloCheckBox(String title){
		setTitle(title);
		setSize(500,500);
		setLocation(300,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.check = new JCheckBox[3];
    this.check[0] = new JCheckBox("チェック１",true);// ',true'で初期状態からチェックがつく
    this.check[1] = new JCheckBox("チェック2");
    this.check[2] = new JCheckBox("チェック3");

       	


    this.lbl = new JLabel[3];
   	this.lbl[0] = new JLabel();
   	this.lbl[1] = new JLabel();
   	this.lbl[2] = new JLabel();

   	JPanel panel = new JPanel();
   	JPanel msg = new JPanel();
   	panel.setLayout(new GridLayout(1,3));
   	msg.setLayout(new GridLayout(1,3));
   	for(int i = 0; i<3 ; i++){
   	  panel.add(this.check[i]);
   	  msg.add(this.lbl[i]);

   	}
       	
    JButton btn = new JButton("結果表示");
    btn.addActionListener(this);
   	JPanel pnlbutton = new JPanel();
   	pnlbutton.add(btn);


    Container cont = getContentPane();
   	cont.add(panel, BorderLayout.NORTH);
   	cont.add(msg, BorderLayout.CENTER);
   	cont.add(pnlbutton, BorderLayout.SOUTH);
	}
	public void actionPerformed(ActionEvent e){
   		System.out.println("CLICK!!");
  }
}