package gui;

import javax.swing.table.AbstractTableModel;

public class model extends AbstractTableModel {
	

	String[] columnNames = {"Vname", 0, 15, 7}; 

	ArrayList<prozess> data = new ArrayList<>(

			Arrays.asList(

			new prozess("Peter", "Mustermann", "TG12/1"),

			new prozess("Sandra", "Schmidt","TG12/1"),

			new prozess("Tobias", "Müller","TG12/3")

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
			 return data.get(row).vorname;
			case 1:
				 return data.get(row).nachname;
			case 2:
				 return data.get(row).klasse;
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
				Person p = data.get(row);
				switch (col) {
				case 0:
					p.vorname = (String) value;
					break;
				 case 1:
					p.nachname = (String) value;
					break;
				case 2:
					p.klasse = (String) value; 
					break;
				}
			
			}

			public void appendEmptyRow() {
				// TODO Auto-generated method stub
				data.add(new Person("","",""));
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
