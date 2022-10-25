package tw.lisa.myjava;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Lisa015 extends JFrame implements ActionListener{
	private JButton b1,b2,b3;
	private JTextArea log;
	private int answer;
	public Lisa015() {
		super("踩炸彈遊戲");
	
	b1=new JButton("炸彈a");
	b2=new JButton("炸彈b");
	b3=new JButton("炸彈c");
	
	setLayout(new FlowLayout());
	add(b1);add(b2);add(b3);
	
	setSize(400, 200);
	setVisible(true);
	setDefaultLookAndFeelDecorated(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	newround();
	
	
	
	//核心功能
		for(int i=0;i<3;i++) {
			int rand=(int)(Math.random()*3);
}
		
	}
	
	
	
	private void newround() {
		// TODO Auto-generated method stub
		
	}



	public static void main(String[] args) {
		new Lisa015();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	b1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("boomb");
		}
	});
	b2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		System.out.println("It's safe");	
		}
	});
	b3.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("OK");
		}
	});
	
			
		}
	}

