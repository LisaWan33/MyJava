package tw.lisa.myitems;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MystdntTable extends JTable{
	private MystdntTableModel tableModel;
	private stdntDB stdntDB;
	
public MystdntTable() throws Exception{//建構式
		
		stdntDB = new stdntDB();
		stdntDB.queryData("SELECT * FROM stdnt");
		
		tableModel = new MystdntTableModel();
		setModel(tableModel);
		tableModel.setColumnIdentifiers(stdntDB.getHeader());
		
	}
	public void delRow() {
		tableModel.removeRow(getSelectedRow());       
		 repaint();
		 
	}
	
	public void newsql() {
		try {
			stdntDB.queryData("SELECT 學號, 姓名, 電話,通訊地址 FROM stdnt ORDER BY 學號");

			tableModel.setColumnIdentifiers(stdntDB.getHeader());
			repaint();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public void backsql() {
		try {
			stdntDB.queryData("SELECT*FROM stdnt");

			tableModel.setColumnIdentifiers(stdntDB.getHeader());
			repaint();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	
	public class MystdntTableModel extends DefaultTableModel {
		@Override
		public int getRowCount() {
			return stdntDB.getRows();
		}

		@Override
		public int getColumnCount() {
			return stdntDB.getCols();
		}

		@Override
		public Object getValueAt(int row, int column) {
			return stdntDB.getData(row+1, column+1);
		}

		@Override
		public void setValueAt(Object aValue, int row, int column) {
			stdntDB.setData(row+1, column+1,(String)aValue);
		}

		@Override
		public boolean isCellEditable(int row, int column) {
			return column>0;
		}

		@Override
		public void removeRow(int row) {
			stdntDB.delData(row+1);
		}
		
	}
}