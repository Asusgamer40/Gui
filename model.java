package gui;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.table.AbstractTableModel;

public class model extends AbstractTableModel {
	

	String[] columnNames = {"1", "2", "3", "4","5","6","7","8","9","10","11","12","13","14","15"}; 

	ArrayList<prozess> data = new ArrayList<>(

			Arrays.asList(

			new prozess("Prozess", "0", "5", "8")
			)

			);

			@Override
			public int getColumnCount() {
				return 3;
		
			}

			@Override
			public int getRowCount() {
				return data.size();
			}
			

			@Override
			public Object getValueAt(int row, int col) {
				
			switch (col) {
			case 0:
				return data.get(row).Prozessname;
			case 1:
				 return data.get(row).Wartezeit;
			case 2:
				 return data.get(row).Priorität;
			}
			return null;
						
			} 

			Class[] columns = new Class[]{
					String.class, String.class, String.class
					}; 
			
			public Class getColumnClass(int c) {
				return columns[c];
			}
	
			public boolean isCellEditable(int row, int col) {			
				return true;
			}

			public void setValueAt(Object value, int row, int col) {
				prozess p = data.get(row);
				switch (col) {
				case 0:
					p.Prozessname = (String) value;
					break;
				 case 1:
					p.Wartezeit = (String) value;
					break;
				case 2:
					p.Priorität = (String) value; 
					break;
				}
			
			}

			public void appendEmptyRow() {
				// TODO Auto-generated method stub
				data.add(new prozess("","","",""));
				int count = getRowCount();
				fireTableRowsInserted(0, count);
			}	
			
			public void deleteRow(int rowIndex) {
				data.remove(data.get(rowIndex));
				int count = getRowCount();
				fireTableRowsDeleted(count, count);
				fireTableRowsInserted(0, count);
			}
}
