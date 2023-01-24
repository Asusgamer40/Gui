package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import javax.swing.JProgressBar;

public class view extends JFrame {
	public view() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		setBounds(1920/2-250, 1080/2-200, 500, 400);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JSplitPane splitPane = new JSplitPane();
		panel.add(splitPane, BorderLayout.SOUTH);
		
		JButton runBTN = new JButton("Run");
		splitPane.setLeftComponent(runBTN);
		
		JProgressBar progressBar = new JProgressBar();
		splitPane.setRightComponent(progressBar);
		
		JSplitPane splitPane_1 = new JSplitPane();
		panel.add(splitPane_1, BorderLayout.CENTER);
		
		JTable table = new JTable();
		splitPane_1.setRightComponent(table);
		table.;
		
		JPanel panel_1 = new JPanel();
		splitPane_1.setLeftComponent(panel_1);
		panel_1.setBounds(0,0,400,400);
		
	}
}

	
