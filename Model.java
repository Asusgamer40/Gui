package BäschdäBägäsch;

import javax.swing.table.AbstractTableModel;

public class Model extends AbstractTableModel{
	
	String[] columnNames = {"Vorname","Nachname","Klasse"}; 

			Object[][] data = {
					
			{"Peter", "Mustermann","TG12/1"}, 
			{"Sandra", "Schmidt","TG12/1"}, 
			{"Tobias", "Müller","TG12/3"}}; 
			
			public int getRowCount() {
				return data.length;
			}

			public int getColumnCount() {
				return columnNames.length;
			}

			public Object getValueAt(int rowIndex, int columnIndex) {
				return data[rowIndex][columnIndex];
			}
			Class[] columns = new Class[]{
					String.class, 
					String.class,
					String.class}; 
			
			public Class getColumnClass(int c) {
				return columns[c];
			}

			public boolean isCellEditable(int row, int col) {
				if(col == 1) {
					return true;
				}
				else {
					return false;
				}
			}

			public void setValueAt(Object value, int row, int col) {
				if(isCellEditable(row, col)) {
					data[row][col] = value;
				}
			}
}
