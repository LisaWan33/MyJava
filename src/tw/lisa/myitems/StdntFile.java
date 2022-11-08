package tw.lisa.myitems;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sql.RowSetListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class StdntFile extends JFrame{
	private JTextArea TA;
	private JMenuItem ad;
	private JMenuItem sd;
	private JMenuItem ab;
	
//	private MyClock myClock;
	
	
	
	public StdntFile() {
		
		JFrame jf= new JFrame("學生資料檔案系統"); 
		
		
		//建置選單列
		JMenuBar mb=new JMenuBar();
		//選單
		JMenu imp =new JMenu("匯入");
		//選單中項目
		JMenuItem ad =new JMenuItem("添加資料");
		
		//JMenuItem包入JMenu
		imp.add(ad);
		
		
//		imp.addSeparator(); //分隔線
		
		
		JMenu sea=new JMenu("搜尋");
		JMenuItem sd=new JMenuItem("搜尋資料");
		sea.add(sd);
		
		JMenu abo=new JMenu("關於");
		JMenuItem ab=new JMenuItem("關於此系統介紹");
		abo.add(ab);
		
		mb.add(imp);
		mb.add(sea);
		mb.add(abo);
		//設置選單列
		jf.setJMenuBar(mb);
		
		
		
//		setLayout(new BorderLayout());
//		
//		JPanel top=new JPanel(new FlowLayout());
		

		jf.setSize(700, 400);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setupListener();
	}
	
	public void setupListener() {
		
		ad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JFrame jf1=new JFrame();
					
					jf.setVisible(false);
					jf1.setVisible(true);
					
					}catch(Exception e) {
						System.out.println("系統發生意外");
					}
				
				
				
			}
		});
	
		
		sd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		ab.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
	
	
	
	
////////////////////////////////////////////////////
	public static void main(String[] args) {
		new StdntFile() ;
	}

}
