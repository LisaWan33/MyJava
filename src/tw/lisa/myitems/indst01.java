package tw.lisa.myitems;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class indst01 { 
	public static void main(String[] args) {
	win1 win= new win1(); 
	
	//背景圖片
			ImageIcon img =new ImageIcon("dir1/class.jpg");
			
			//將背景圖顯示在標籤中
			JLabel imgjl=new JLabel(img);
			//再將標籤大小設置成剛好填充的整個面板
			imgjl.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
			
			//獲取frame的最上層面板爲了設置其背景顏色（JPanel有設置透明的方法）
			Container cp= win.getContentPane();
			//把内容窗格轉為JPanel，否則不能用方法setOpaque()來使内容窗格透明
			
			cp.setLayout(new FlowLayout());
			((JPanel) cp).setOpaque(false);//設置透明
		
		
			//添加圖片到frame的第二層
			//(背景標籤新增到jfram的LayeredPane面板裡
			// // 把背景圖添加到分層窗格的最底層以作為背景
			win.getLayeredPane().add(imgjl, new Integer(Integer.MIN_VALUE));
		
		}
	}
//https://www.796t.com/content/1549374483.html:設置背景
//https://blog.xuite.net/mangohost/wretch/123103010
//https://kknews.cc/code/v8xpovq.html


class win1 extends JFrame{ //父視窗
	
	public win1() {
		super("學生資料檔案系統"); 
		setSize(700, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//容器
		Container pn=getContentPane();
		FlowLayout fy = new FlowLayout();
		pn.setLayout(fy); 
		
		
		//建置選單列
		JMenuBar mb=new JMenuBar();
		//選單
		JMenu imp =new JMenu("匯入");
		//選單中項目
		JMenuItem ad =new JMenuItem("添加資料");
		//JMenuItem包入JMenu
		imp.add(ad);
		
		JMenu sea=new JMenu("搜尋");
		JMenuItem sd=new JMenuItem("搜尋資料");
		sea.add(sd);
		
		JMenu abo=new JMenu("關於");
		JMenuItem ab=new JMenuItem("關於此系統介紹");
		abo.add(ab);
		
		mb.add(imp);
		mb.add(sea);
		mb.add(abo);
		
		pn.add(mb);
		
		//ad事件動作
		ad.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 開啟視窗
				win2 fr=new win2();
			}
		});
		
		
		sd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//開啟視窗
				win3 fr1=new win3();
			}
		});
		
		setContentPane(pn);
	}
}


class win2 extends JFrame{ //子視窗
	
	public win2() {
		super("添加資料表");
		setSize(700, 300);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		

		//容器
		Container pn=getContentPane();
		//面板
		JPanel p1=new JPanel();
		p1.setLayout(new GridLayout(4,2,5,5));
		
		
		//建置內容=>>>>
		//標籤1
		JLabel name =new JLabel("姓名: ",JLabel.CENTER);
		p1.add(name);
		//文本域
		JTextField f1 = new JTextField(8);
		p1.add(f1);

		
		//標籤2
		JLabel tel =new JLabel("電話/行動電話: ",JLabel.CENTER);
		p1.add(tel);
		JTextField f2 = new JTextField(8);
		p1.add(f2);
		
		//標籤3
	
		JLabel  id=new JLabel("學號: ",JLabel.CENTER);
		p1.add(id);
		JTextField f3 = new JTextField(8);
		p1.add(f3);
		
		//標籤4
		JLabel date= new JLabel("生日(yyyy-mm-dd): ",JLabel.CENTER);
		p1.add(date);
		JTextField f4=new JTextField(8);
		p1.add(f4);
		
	
		JPanel p2=new JPanel();
		p1.setLayout(new GridLayout(2,2,5,5));
		
		//標籤5
		JLabel ctp =new JLabel("緊急聯絡人  : ");
		p2.add(ctp);
		JTextField f5 = new JTextField(16);
		p2.add(f5);
		
		//標籤6
		JLabel ctptel =new JLabel("緊急聯絡人電話   : ");
		
		p2.add(ctptel);
		JTextField f6 = new JTextField(16);
		p2.add(f6);
		
		
		JPanel p3=new JPanel();
		
		JLabel addr= new JLabel("通訊地址: ");
		p3.add(addr);
		JTextField f7=new JTextField(30);
		p3.add(f7);
		
		JPanel p4=new JPanel();
		JLabel remark = new JLabel("備註欄位: ");
		p4.add(remark);
		JTextField f8=new JTextField(30);
		p4.add(f8);
		
		//可建按鈕(是否新增一筆資料)
		JPanel p5=new JPanel();
		
		JButton bt=new JButton("新增");
		JButton bt1=new JButton("取消");
		p5.add(bt);
		p5.add(bt1);
		
		setLayout(new GridLayout(6,1,5,5));
		
		pn.add(p1);pn.add(p2);
		pn.add(p3);pn.add(p4);pn.add(p5);
		
		setContentPane(pn);
		
		
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Properties prop= new Properties();
				prop.put("user", "root");
				prop.put("password", "root");
				String url="jdbc:mysql://localhost:3309/eeit53";
									
				try {
						Connection conn = DriverManager.getConnection(url,prop);
					String name = f1.getText();
					String tel =f2.getText();
					String id = f3.getText();
					String date =f4.getText();
					
					String addr = f5.getText();
					String ctp = f6.getText();
					String ctptel = f7.getText();
					String remark = f8.getText();
					
					String sql=	"INSERT INTO stdnt(姓名,電話,學號,生日,通訊地址,聯絡人,聯絡人電話,備註欄)VALUES(?,?,?,?,?,?,?,?)";
					PreparedStatement pstmt =conn.prepareStatement(sql);
					pstmt.setString(1, name);
					pstmt.setString(2, tel);
					pstmt.setString(3, id);
					pstmt.setString(4, date);
					pstmt.setString(5, addr);
					pstmt.setString(6, ctp);
					pstmt.setString(7, ctptel);
					pstmt.setString(8, remark);
					
					pstmt.executeUpdate();
					conn.close();
					System.out.println("ok");
					JOptionPane.showMessageDialog(bt1, "已成功新增一筆學生資料! ");
					dispose();
				} catch (Exception e1) {
					System.out.println("xx");
					JOptionPane.showMessageDialog(bt1, "資料未填寫正確或學號已重複，請重新檢查後再輸入謝謝!");
				}
			}
		});
		
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}


class win3 extends JFrame{ //子視窗
	public win3() {
		super("搜尋資料表");
		setSize(700, 400);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		
		//容器
		Container pn=getContentPane();
		FlowLayout fy = new FlowLayout();
		pn.setLayout(fy); 

		//建置內容
		JPanel jp=new JPanel();
		JLabel search=new JLabel("查詢(請輸入學號):");
		jp.add(search);
		
		JTextField field7=new JTextField(8);
		jp.add(field7);
		
		//可建按鈕
		JButton jb=new JButton("確定");
		JButton jb1=new JButton("取消");
		
		
		pn.add(jp);
		pn.add(jb); 
		pn.add(jb1);
		
		setContentPane(pn);
	jb.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Properties prop= new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			String url="jdbc:mysql://localhost:3309/eeit53";
								
			try {
					Connection conn = DriverManager.getConnection(url,prop);
					String sql="select *from stdnt where 學號='"+field7.getText()+"'";
					Statement stmt = conn.createStatement(
							ResultSet.TYPE_SCROLL_INSENSITIVE, 
							ResultSet.CONCUR_UPDATABLE);
					ResultSet rs=stmt.executeQuery(sql);
					
					
					
					
			}catch(Exception e2) {
				
			}
			
			
			
			
			
			
			
		}
	});
	
	jb1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	});
	
	}
}