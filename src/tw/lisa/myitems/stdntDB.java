package tw.lisa.myitems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class stdntDB {
	private final static String url = "jdbc:mysql://localhost:3309/eeit53";
	private Connection conn;
	private ResultSet rs;
	private String[] fieldNames;
	
	
	public stdntDB() throws SQLException{
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		conn = DriverManager.getConnection(url,prop);
	}
	
	
	public void queryData(String sql) throws SQLException {
		Statement stmt = conn.createStatement(
				ResultSet.TYPE_SCROLL_INSENSITIVE, 
				ResultSet.CONCUR_UPDATABLE);
		rs = stmt.executeQuery(sql);
		

		
		ResultSetMetaData rsmd = rs.getMetaData();
		int colCount = rsmd.getColumnCount();
		fieldNames = new String[colCount];
		for (int i=0; i<colCount; i++) {
			fieldNames[i] = rsmd.getColumnName(i+1);
		}
	}
	public int getRows() {
		try {
			rs.last();
			return rs.getRow();
		}catch(Exception e) {
			return 0;
		}
	}
	
	public int getCols() {
		return fieldNames.length;
	}
	
	public String[] getHeader() {
		return fieldNames;
	}
	
	public String getData(int row, int col) {
		try {
			rs.absolute(row);
			String data = rs.getString(col);
			return data;
		}catch (Exception e) {
			System.out.printf("%d : %d : %s\n", row, col, e.toString());
			return null;
		}
	}
	
//	public String getValueAt(int row, int col) {
//		 return (fieldNames.this.rs.get(row)).get(col);
//		
//	}
	
	public void setData(int row, int col, String data) {
		try {
			rs.absolute(row);
			rs.updateString(col, data);
			rs.updateRow();
		}catch(Exception e) {
			System.out.printf("%d : %d : %s : %s\n", row, col, e.toString());
		}
	}
	
	public void delData(int row) {
		try {
			rs.absolute(row);
			rs.deleteRow();
		
		}catch(Exception e) {
			System.out.printf("%d : %s\n", row, e.toString());
		}
	}	
}

