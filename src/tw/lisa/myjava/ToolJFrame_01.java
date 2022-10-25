package tw.lisa.myjava;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ToolJFrame_01 extends JFrame{
		private JButton b1,b2;

		/* 若只有一個單一視窗:
		   命名方式用 super("")
		 * 單一視窗，做初始化	
		 * 在pulic class 呼叫爸爸，extends JFrame
		 * 可以建立JButton，但仍須建構式，第10列
		 * 呼叫設計師，setLayout
		 * 			new ToolJFrame_02();
		}
	public ToolJFrame_02() {	
		 */
		public ToolJFrame_01 () {
			super("Start");
			setLayout(new FlowLayout());
			
			b1=new JButton("按鈕1");
			b2=new JButton("按鈕2");
			add(b1);add(b2);
			
			setSize(300, 300);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			b1.setBackground(Color.BLUE);
			b2.setBackground(Color.GREEN);
		}
			
public static void main(String[] args) {
	new ToolJFrame_01();
	}
}