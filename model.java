package gui;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class model extends AbstractTableModel {
	
	ArrayList<prozess> Prozesse = new ArrayList<prozess>();
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	public void setProzesse(prozess p) {
		Prozesse.add(p);
	}
	public prozess getProzesse(int stelle) {
		return Prozesse.get(stelle);
	}
	
	
}
