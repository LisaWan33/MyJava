package tw.lisa.myitems;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.WindowConstants;

import tw.lisa.myjava.ToolJFrame_01;

public class indst01 { 
	
	public static void main(String[] args) {
	win1 win= new win1(); 
	
	
	//背景圖片
			ImageIcon img =new ImageIcon("dir1/class21.jpg");
			
	//新增JLabel 放置圖片
			JLabel imgjl=new JLabel(img);
			
	//	設定label的位置、大小，label大小為圖片的大小，再將標籤大小設置成剛好填充的整個面板

			imgjl.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
			
	//獲取frame的最上層面板，爲了設置其背景顏色（JPanel有設置透明的方法）
			Container cp= win.getContentPane();
			
			cp.setLayout(new FlowLayout());
			((JPanel) cp).setOpaque(false); //設置透明
	//把内容窗格轉為JPanel，否則不能用方法setOpaque()來使内容窗格透明

	//添加圖片到frame的第二層
	//背景標籤新增到jframe的LayeredPane面板裡
	// 把背景圖添加到分層窗格的最底層以作為背景
	win.getLayeredPane().add(imgjl, new Integer(Integer.MIN_VALUE));
		
		}
	}

//https://www.796t.com/content/1549374483.html:設置背景
//https://blog.xuite.net/mangohost/wretch/123103010
//https://kknews.cc/code/v8xpovq.html


class win1 extends JFrame{ //父視窗
	
	public win1() {
		super("學生資料檔案系統"); 
		setSize(370, 270);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//容器
		Container pn=getContentPane();
		FlowLayout fy = new FlowLayout();
		pn.setLayout(fy); 
		
		
		//建置選單列=>選單=>選單中項目
		JMenuBar mb=new JMenuBar();
		
		JMenu imp =new JMenu("匯入");
		JMenuItem ad =new JMenuItem("添加資料");
		//JMenuItem包入JMenu
		
		JMenu sea=new JMenu("搜尋");
		JMenuItem sd=new JMenuItem("搜尋資料");
		
		JMenu lt=new JMenu("每日工作清單");
		JMenuItem txt=new JMenuItem("記事本");
		
		JMenu abo=new JMenu("關於");
		JMenuItem ab=new JMenuItem("關於此系統介紹");
		
		imp.add(ad);
		sea.add(sd);
		lt.add(txt);
		abo.add(ab);
		
		mb.add(imp);
		mb.add(sea);
		mb.add(lt);
		mb.add(abo);
		
		pn.add(mb);
		
		//ad事件動作
		ad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 開啟新視窗
				win2 fr=new win2();
			}
		});
		
		//sd事件動作
		sd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//開啟新視窗
				win3 fr1=new win3();
			}
		});
		
		//lt事件動作
		txt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 開啟新視窗
				win4 fr2 =new win4();

			}
		});
		
		//ad事件動作
		ab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(ab, 
					"使用方式:\n"
					+ "【匯入】: 匯入菜單，得填寫新學生資訊表\n"
					+ "        	填入資訊後，請確認之後再送出!\n "
					+ "        	***友情提示***\n "
					+ "         除備註欄可留空外，其餘請填寫詳細正確資料，否則無法新增成功!\n"
					+ "\n"
					+ "【搜尋】: 搜尋菜單，得查詢全部學生資料\n"
					+ "         1. 快速查詢: 直接查詢學生之學號、姓名、電話、通訊地址\n"
					+ "         2. 恢復原查詢: 退回原顯示查詢畫面\n"
					+ "         3. 刪除: 選定欄位，做刪除動作\n"
					+ "         ***友情提示***\n "
					+ "         若需修正資料，只需選定指定欄位，按滑鼠左鍵兩下即可更改資料，謝謝!\n"
					+ "\n"
					+ "【每日工作清單】: 記事本菜單，得為寫入每日待辦事項，也得以當成即時紀錄資料工具\n"
					+ "         1. 開啟舊檔: 得於電腦中直接開啟過去編輯之文字檔\n"
					+ "         2. 另存新檔: 文字新建或已修改之新內容，得儲存至電腦中\n ");
			}
		});
		setContentPane(pn);
	}
}


class win2 extends JFrame{ //建置子視窗一
	
	public win2() {
		super("添加資料表");
		setSize(700, 300);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//容器
		Container pn=getContentPane();
		//第一面板
		JPanel p1=new JPanel();
		p1.setLayout(new GridLayout(4,2,5,5));
		
		
		//建置內容=>標籤=>文本域
		JLabel name =new JLabel("姓名: ",JLabel.CENTER);
		JTextField f1 = new JTextField(8);
		
//		String hintText=new String();
//		f1.setText(hintText);
//		f1.setForeground(Color.gray);
//		f1.addFocusListener(new JTextFi());
		
		p1.add(name);
		p1.add(f1);

		
		JLabel tel =new JLabel("電話:"+"(ex:09xxxxxxxx,市號電話請加'-')\n",JLabel.CENTER);
		JTextField f2 = new JTextField(8);

		p1.add(tel);
		p1.add(f2);
		
	
		JLabel  id=new JLabel("學號: ",JLabel.CENTER);
		JTextField f3 = new JTextField(8);
		p1.add(id);
		p1.add(f3);
		
		JLabel date= new JLabel("生日(yyyy-mm-dd): ",JLabel.CENTER);
		JTextField f4=new JTextField(8);
		p1.add(date);
		p1.add(f4);
		
	//第二面板
		JPanel p2=new JPanel();
		p1.setLayout(new GridLayout(2,2,5,5));
		
		JLabel ctp =new JLabel("緊急聯絡人  : ");
		JTextField f5 = new JTextField(16);
		p2.add(ctp);
		p2.add(f5);
		
		JLabel ctptel =new JLabel("緊急聯絡人電話   : ");
		JTextField f6 = new JTextField(16);
		p2.add(ctptel);
		p2.add(f6);
		
		//第三面板
		JPanel p3=new JPanel();
		
		JLabel addr= new JLabel("通訊地址: ");
		JTextField f7=new JTextField(30);
		p3.add(addr);
		p3.add(f7);
		
		//第四面板
		JPanel p4=new JPanel();
		
		JLabel remark = new JLabel("備註欄位: ");
		JTextField f8=new JTextField(30);
		p4.add(remark);
		p4.add(f8);
		
		//第五面板=>按鈕
		JPanel p5=new JPanel();
		
		JButton bt=new JButton("新增");
		JButton bt1=new JButton("取消");
		p5.add(bt);
		p5.add(bt1);
		
		setLayout(new GridLayout(6,1,5,5));
		
		pn.add(p1);
		pn.add(p2);
		pn.add(p3);
		pn.add(p4);
		pn.add(p5);
		
		setContentPane(pn);
		
		//開始做按鈕的事
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//想在資料表中新增資料
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
					
					String ctp = f5.getText();
					String ctptel = f6.getText();
					String addr = f7.getText();
					String remark = f8.getText();
					
					String regex="0\\d{2,3}\\s?\\d{7,8}|0\\d{1,2}[-]?\\d{6}|0\\d{4,5}[-]?\\d{4}";
					boolean flag=tel.matches(regex);
					boolean flag1=ctptel.matches(regex);
					
					if(flag) {
						System.out.println("個人電話無錯誤");
					if(flag1) {
						System.out.println("聯絡人電話無錯誤");
						
					String sql=	"INSERT INTO stdnt(姓名,電話,學號,生日,聯絡人,聯絡人電話,通訊地址,備註欄)VALUES(?,?,?,?,?,?,?,?)";
					PreparedStatement pstmt =conn.prepareStatement(sql);
					pstmt.setString(1, name);
					pstmt.setString(2, tel);
					pstmt.setString(3, id);
					pstmt.setString(4, date);
					pstmt.setString(5, ctp);
					pstmt.setString(6, ctptel);
					pstmt.setString(7, addr);
					pstmt.setString(8, remark);
					
					pstmt.executeUpdate();
					conn.close();
					System.out.println("ok");
					JOptionPane.showMessageDialog(bt, "已成功新增一筆學生資料 ! ");
					}else {
						System.out.println("聯絡人電話有錯誤");
						JOptionPane.showMessageDialog(bt, "輸入的聯絡人電話有誤 !"+"請重新確認 !\n");
					}
					}else {
						System.out.println("個人電話號碼有錯誤");
					 JOptionPane.showMessageDialog(bt, "輸入的個人電話號碼有誤 !"+"請重新確認 !\n ");
					}
				
				} catch (Exception e1) {
					System.out.println("學號重複");
					JOptionPane.showMessageDialog(bt, "資料未填寫正確或學號有重複，請重新檢查謝謝 !");
				}
			}
		});
		
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); //取消的按鍵
			}
		});
	}
}


class win3 extends JFrame{ //建置子視窗二
	private MystdntTable stdntTable;
	
	public win3() {
		super("搜尋資料表");
		setSize(700, 400);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		
		//建資料庫面板
		setLayout(new BorderLayout());
		try {
			stdntTable = new MystdntTable();
		}catch(Exception e) {
			System.out.println(e);
			}
		JScrollPane jsp = new JScrollPane(stdntTable);
		add(jsp,BorderLayout.CENTER);
		
		
		JPanel top=new JPanel(new FlowLayout());
		//建按鈕
		JButton jb = new JButton("快速查詢");
		JButton jb1 = new JButton("恢復原查詢");
		JButton jb2 = new JButton("刪除");
		
		add(top,BorderLayout.NORTH);
		top.add(jb); 
		top.add(jb1);
		top.add(jb2);
		
		
	jb.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//透過newsql查詢(學號, 姓名, 電話,通訊地址)
			stdntTable.newsql();
			JOptionPane.showMessageDialog(jb, "已重新查詢!");
		}
	});
	
	jb1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//查詢所有stdnt資料
			stdntTable.backsql();
			JOptionPane.showMessageDialog(jb, "已恢復查詢 !");

		}
	});
	
	jb2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//建置刪除按鈕
			int option=JOptionPane.showConfirmDialog(
					null, "確定要刪除資料?","刪除資料確認",
					JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE,null);
				switch(option) {
				case JOptionPane.YES_OPTION:
					stdntTable.delRow(); break;
				case JOptionPane.NO_OPTION:	
			}
		}
	});
	}
}


class win4 extends JFrame{
	private JButton open,saveas;
	private JTextArea myTextArea;
	private JScrollPane jp;
	private MyClock myClock;
	
	public win4(){
	super("每日清單小視窗");
	setSize(400, 600);
	setVisible(true);
	setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	
	//建資料庫面板
	setLayout(new BorderLayout());
	open=new JButton("開啟舊檔");
	saveas=new JButton("另存新檔");
	myClock=new MyClock();
	myTextArea=new JTextArea();
	
	
	JPanel top=new JPanel(new FlowLayout());
	top.add(open);
	top.add(saveas);
	top.add(myClock);
	add(top,BorderLayout.NORTH);
	
	myTextArea.setLineWrap(true);
	
	jp=new JScrollPane(
	myTextArea,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
	ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	jp.setBounds(100, 100, 300, 500);
	add(jp,BorderLayout.CENTER);
	
	setupListener();
}
/**********************************************/
private void setupListener() {
	open.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		try {
			openfile();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		}
	});
	

	saveas.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		try {
			saveasfile();
		} catch (Exception e1) {
			e1.printStackTrace();
		}	
		}
	});	
}
///////////////////////////////////////////////////////////////////////////

private void openfile() throws Exception { // 讀取檔案並附加至文字編輯區
	BufferedReader buf=
			new BufferedReader(
			new FileReader(choosefileToOpen()));
	String text;
	
	// 取得系統相依的換行字元
	String lineSeparator = System.getProperty("line.separator");
	while( (text = buf.readLine()) != null) { 
		myTextArea.append(text);
		myTextArea.append(lineSeparator);
	} buf.close();
}



private void saveasfile()throws Exception{
	String text=myTextArea.getText();
	BufferedWriter bufw=
			new BufferedWriter(
			new FileWriter(choosefileToSave()));
	
	bufw.write(text);
	bufw.flush();
	bufw.close();
	JOptionPane.showOptionDialog(
			null, "已存檔 ! ","確定",JOptionPane.DEFAULT_OPTION,
			JOptionPane.INFORMATION_MESSAGE,null,null,null);
}



/////////////////////////////////////////////////////////	
private static File choosefileToOpen() {
	// fileChooser 是 JFileChooser 的實例
	 // 顯示檔案選取的對話方塊
	JFileChooser jfc =new JFileChooser();
	if(jfc.showOpenDialog(null)==JFileChooser.APPROVE_OPTION) {
		return jfc.getSelectedFile();
	}else {return null; }
}

private static File choosefileToSave() {
	JFileChooser jfc =new JFileChooser();
	if(jfc.showSaveDialog(null)==JFileChooser.APPROVE_OPTION) {
		return jfc.getSelectedFile();
	}else {return null;	}
}
}