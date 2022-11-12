package tw.lisa.myitems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class indst02 {

	public static void main(String[] args) {
		Properties prop= new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		String url="jdbc:mysql://localhost:3309/eeit53";
		String sql=	"INSERT INTO stdnt(姓名,學號,電話,通訊地址,聯絡人,聯絡人電話,備註欄)VALUES(?,?,?,?,?,?,?)";
//		String sql=	"INSERT INTO stdnt(姓名,學號,電話,通訊地址)VALUES(?,?,?,?)";
		
//		String sql=	
//				"INSERT INTO stdnt VALUES"
//				+ "(姓名='"+name+"',學號='"+id+"',電話='"+tel+"',通訊地址='"+addr+"',聯絡人='"+ctp+"',聯絡人電話='"+ctptel+"',備註='"+remark+"')";	
		
		
		
		
		try (
			Connection conn = DriverManager.getConnection(url,prop);
			
			PreparedStatement pstmt =conn.prepareStatement(sql)){

//
//			String name = field1.getText();
//			String id = field2.getText();
//			String tel = field3.getText();
//			String addr = field4.getText();
//			
//			String gender = group.getSelection().getActionCommand();
//			String ctp = field5.getText();
//			String ctptel = field6.getText();
//			String remark = field7.getText();
			
			pstmt.setString(1, "Matk");
			pstmt.setString(2, "456");
			pstmt.setString(3, "4456");
			pstmt.setString(4, "33");
			
			pstmt.setString(5, "33");
			pstmt.setString(6, "33");
			pstmt.setString(7, "33");
		
			
			pstmt.executeUpdate();
			conn.close();
			System.out.println("ok");
		} catch (Exception e1) {
			System.out.println(e1);
		}
		
	}

}


/////////////////////////////////////////////////
//JPanel p2=new JPanel();
//
//// 設置單選按鈕
//JLabel gender = new JLabel("性別");
//p2.add(gender);
//
//JRadioButton male = new JRadioButton("男");
//
//JRadioButton female = new JRadioButton("女");
//
//// 單選按鈕組,同一個單選按鈕組的互斥.
//
//ButtonGroup group = new ButtonGroup();
//
//group.add(male);
//p2.add(male);
//group.add(female);
//p2.add(female);
//
////////////////////////////////////