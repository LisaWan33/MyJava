package tw.lisa.myjava;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ToolJFrame_02 extends JFrame {

	public static void main(String[] args) {
	

		//若是兩個視窗要命名，則用 .setTitle
		JFrame f1=new JFrame();
		f1.setLayout(new FlowLayout());
		

		f1.setSize(200, 200);
		f1.setTitle("F1");
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JFrame f2=new JFrame();
		f2.setLayout(new BorderLayout());

		f2.setSize(200, 200);
		f2.setTitle("F2");
		f2.setVisible(true);
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
	}

}