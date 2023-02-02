package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

public class view extends JFrame {
	private JButton AddProcessBTN; 
	private JButton AddProcessBTN_1;
	private JTextField txtprocessname;
	private JInternalFrame internalFrame;
	private JButton btnNewButton;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	private JComboBox comboBox_4;
	private JComboBox comboBox_5;
	private JButton runBTN;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_18;
	private JTable table;
	private DefaultTableModel DTM;
	
	public view() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		setBounds(1920/2-250, 1080/2-200, 750, 500);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setResizeWeight(0.27);
		panel.add(splitPane, BorderLayout.SOUTH);
		
		runBTN = new JButton("Run");
		splitPane.setLeftComponent(runBTN);
		
		JProgressBar progressBar = new JProgressBar();
		splitPane.setRightComponent(progressBar);
		
		JSplitPane splitPane_1 = new JSplitPane();
		splitPane_1.setResizeWeight(0.25);
		panel.add(splitPane_1, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		splitPane_1.setLeftComponent(panel_1);
		panel_1.setBounds(0,0,300,200);
		panel_1.setLayout(null);
		
		AddProcessBTN = new JButton("Add Process");
		AddProcessBTN.setBounds(0, 109, 120, 23);
		panel_1.add(AddProcessBTN);
		
		AddProcessBTN_1 = new JButton("Remove Process");
		
		AddProcessBTN_1.setBounds(0, 143, 120, 23);
		panel_1.add(AddProcessBTN_1);
		
		JPanel panel_3 = new JPanel();
		splitPane_1.setRightComponent(panel_3);
		panel_3.setLayout(null);
		DTM = new DefaultTableModel(
				new String[][] {
					{".", ".",".", ".",".", ".",".", ".",".", ".",".", ".",".", ".",".", ".",".", ".",".", ".","."},
					{"-", "-","-", "-","-", "-","-", "-","-", "-","-", "-","-", "-","-", "-","-", "-","-", "-","-"},
					{".", ".",".", ".",".", ".",".", ".",".", ".",".", ".",".", ".",".", ".",".", ".",".", ".","."},
					{"-", "-","-", "-","-", "-","-", "-","-", "-","-", "-","-", "-","-", "-","-", "-","-", "-","-"},
					{".", ".",".", ".",".", ".",".", ".",".", ".",".", ".",".", ".",".", ".",".", ".",".", ".","."},
					{"-", "-","-", "-","-", "-","-", "-","-", "-","-", "-","-", "-","-", "-","-", "-","-", "-","-"}
				},
				new String[] {
						"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"

				});
		
		table = new JTable(DTM);
		table.setRowSelectionAllowed(false);
		table.setBounds(0, 27, 475, 135);
		panel_3.add(table);
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		table.setModel(DTM);
		table.getColumnModel().getColumn(0).setPreferredWidth(20);
		table.getColumnModel().getColumn(1).setPreferredWidth(20);
		table.getColumnModel().getColumn(2).setPreferredWidth(20);
		table.getColumnModel().getColumn(3).setPreferredWidth(20);
		table.getColumnModel().getColumn(4).setPreferredWidth(20);
		table.getColumnModel().getColumn(5).setPreferredWidth(20);
		table.getColumnModel().getColumn(6).setPreferredWidth(20);
		table.getColumnModel().getColumn(7).setPreferredWidth(20);
		table.getColumnModel().getColumn(8).setPreferredWidth(20);
		table.getColumnModel().getColumn(9).setPreferredWidth(20);
		table.getColumnModel().getColumn(10).setPreferredWidth(22);
		table.getColumnModel().getColumn(11).setPreferredWidth(22);
		table.getColumnModel().getColumn(12).setPreferredWidth(22);
		table.getColumnModel().getColumn(13).setPreferredWidth(22);
		table.getColumnModel().getColumn(14).setPreferredWidth(22);
		table.getColumnModel().getColumn(15).setPreferredWidth(22);
		table.getColumnModel().getColumn(16).setPreferredWidth(22);
		table.getColumnModel().getColumn(17).setPreferredWidth(22);
		table.getColumnModel().getColumn(18).setPreferredWidth(22);
		table.getColumnModel().getColumn(19).setPreferredWidth(22);
		table.getColumnModel().getColumn(20).setPreferredWidth(22);

		JLabel lblNewLabel_1 = new JLabel("1");
		lblNewLabel_1.setBounds(30, 11, 10, 14);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("2");
		lblNewLabel_2.setBounds(50, 11, 10, 14);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("3");
		lblNewLabel_3.setBounds(73, 11, 10, 14);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("0");
		lblNewLabel.setBounds(10, 11, 10, 14);
		panel_3.add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("4");
		lblNewLabel_4.setBounds(94, 11, 10, 14);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("5");
		lblNewLabel_5.setBounds(118, 11, 10, 14);
		panel_3.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("6");
		lblNewLabel_6.setBounds(138, 11, 10, 14);
		panel_3.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("7");
		lblNewLabel_7.setBounds(160, 11, 10, 14);
		panel_3.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("8");
		lblNewLabel_8.setBounds(180, 11, 10, 14);
		panel_3.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("9");
		lblNewLabel_9.setBounds(204, 11, 10, 14);
		panel_3.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("10");
		lblNewLabel_10.setBounds(224, 11, 14, 14);
		panel_3.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("11");
		lblNewLabel_11.setBounds(243, 11, 17, 14);
		panel_3.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("12");
		lblNewLabel_12.setBounds(270, 11, 17, 14);
		panel_3.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("13");
		lblNewLabel_13.setBounds(294, 11, 14, 14);
		panel_3.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("14");
		lblNewLabel_14.setBounds(318, 11, 17, 14);
		panel_3.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("15");
		lblNewLabel_15.setBounds(338, 11, 20, 14);
		panel_3.add(lblNewLabel_15);
		
		lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setBounds(481, 27, 50, 14);
		panel_3.add(lblNewLabel_16);
		
		lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setBounds(481, 59, 50, 14);
		panel_3.add(lblNewLabel_17);
		
		lblNewLabel_18 = new JLabel("");
		lblNewLabel_18.setBounds(481, 91, 50, 14);
		panel_3.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("16");
		lblNewLabel_19.setBounds(358, 11, 20, 14);
		panel_3.add(lblNewLabel_19);
		
		JLabel lblNewLabel_19_1 = new JLabel("17");
		lblNewLabel_19_1.setBounds(382, 11, 20, 14);
		panel_3.add(lblNewLabel_19_1);
		
		JLabel lblNewLabel_19_2 = new JLabel("18");
		lblNewLabel_19_2.setBounds(403, 11, 20, 14);
		panel_3.add(lblNewLabel_19_2);
		
		JLabel lblNewLabel_19_3 = new JLabel("19");
		lblNewLabel_19_3.setBounds(430, 11, 20, 14);
		panel_3.add(lblNewLabel_19_3);
		
		JLabel lblNewLabel_19_4 = new JLabel("20");
		lblNewLabel_19_4.setBounds(455, 11, 20, 14);
		panel_3.add(lblNewLabel_19_4);
		
		internalFrame = new JInternalFrame("Process");
		panel.add(internalFrame, BorderLayout.NORTH);
		
		
		JPanel panel_2 = new JPanel();
		internalFrame.getContentPane().add(panel_2, BorderLayout.NORTH);
		internalFrame.setVisible(false);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		
		txtprocessname = new JTextField();
		txtprocessname.setText("-Processname-");
		panel_2.add(txtprocessname);
		txtprocessname.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-Priority-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"}));
		panel_2.add(comboBox);
		
		comboBox_1 = new JComboBox();
		panel_2.add(comboBox_1);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"-Calculatingtime 1-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		
		comboBox_2 = new JComboBox();
		panel_2.add(comboBox_2);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"-Waitingtime 1-", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"}));
		
		comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"-Calculatingtime 2-", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		panel_2.add(comboBox_3);
		
		comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"-Waitingtime 2-", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"}));
		panel_2.add(comboBox_5);
		
		comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"-Calculatingtime 3-", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		panel_2.add(comboBox_4);
		
		JLabel label = new JLabel("");
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("");
		panel_2.add(label_1);
		
		btnNewButton = new JButton("Apply");
		internalFrame.getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		
	}
	public JButton getAddProcessBTN() {
		return AddProcessBTN;
	}
	public JButton getAddProcessBTN_1() {
		return AddProcessBTN_1;
	}
	public JInternalFrame getinternalFrame() {
		return internalFrame;
	}
	public JButton getbtnNewButton() {
		return btnNewButton;
	}
	public JComboBox getcomboBox() {
		return comboBox;
	}
	public JComboBox getcomboBox_1() {
		return comboBox_1;
	}public JComboBox getcomboBox_2() {
		return comboBox_2;
	}
	public JComboBox getcomboBox_3() {
		return comboBox_3;
	}
	public JComboBox getcomboBox_4() {
		return comboBox_4;
	}
	public JComboBox getcomboBox_5() {
		return comboBox_5;
	}
	public JTextField gettxtprocessname() {
		return txtprocessname;
	}
	public JButton getrunBTN() {
		return runBTN;
	}
	public void setlblNewLabel_16(String name) {
		lblNewLabel_16.setText(name);
	}
	public void setlblNewLabel_17(String name) {
		lblNewLabel_17.setText(name);
	}
	public void setlblNewLabel_18(String name) {
		lblNewLabel_18.setText(name);
	}
	public JTable getTable() {
		return table;
	}
	public DefaultTableModel getDTM() {
		return DTM;
	}
	public void setDTM(Object[][]inhalt) {
		DTM = new DefaultTableModel(
				inhalt,
				new String[] {
					"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"
				});
	}
}

	
