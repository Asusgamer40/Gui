package B‰schd‰B‰g‰sch;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class View extends JFrame {

	//create
	private JTable table;
	
	public View() {
		setSize(500,120);
		getContentPane().setLayout(new BorderLayout(0,0));
		
		table = new JTable();
		
		getContentPane().add(table, BorderLayout.CENTER);
		
	}
	public JTable getTable() {
		return table;
	}
}