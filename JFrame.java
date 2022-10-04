package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JInternalFrame;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class JFrame extends javax.swing.JFrame {

	private JPanel contentPane;
	private JTextField Password;
	private JTextField User;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame frame = new JFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrame() {
		setTitle("Overview");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 410,230);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Basic", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Color:");
		lblNewLabel.setBounds(10, 0, 99, 56);
		panel.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Red");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBounds(6, 41, 71, 65);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnBlue = new JRadioButton("Blue");
		rdbtnBlue.setBounds(6, 80, 71, 65);
		panel.add(rdbtnBlue);
		
		JRadioButton rdbtnGreen = new JRadioButton("Green");
		rdbtnGreen.setBounds(6, 121, 71, 65);
		panel.add(rdbtnGreen);
		
		
		//
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnNewRadioButton.isSelected()) {
					contentPane.setBackground(Color.RED);
					rdbtnBlue.setSelected(false);
					rdbtnGreen.setSelected(false);
				}
			}
		});
		
		//
		rdbtnBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnBlue.isSelected()) {
					contentPane.setBackground(Color.BLUE);
					rdbtnNewRadioButton.setSelected(false);
					rdbtnGreen.setSelected(false);
				}
			}
		});
		
		//
		rdbtnGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnGreen.isSelected()) {
					contentPane.setBackground(Color.GREEN);
					rdbtnNewRadioButton.setSelected(false);
					rdbtnBlue.setSelected(false);
				}
			}
		});
		
		
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Hints:");
		lblNewLabel_1.setBounds(107, 21, 46, 14);
		panel.add(lblNewLabel_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Activate");
		chckbxNewCheckBox.setBounds(107, 62, 97, 23);
		panel.add(chckbxNewCheckBox);
		
		JLabel lblSecrets = new JLabel("Secrets:");
		lblSecrets.setBounds(224, 21, 63, 14);
		panel.add(lblSecrets);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(224, 63, 63, 20);
		panel.add(comboBox);
		
		JLabel lblTestItOn = new JLabel("Test it on Your own ;)");
		lblTestItOn.setBounds(97, 105, 126, 14);
		lblTestItOn.setVisible(false);
		panel.add(lblTestItOn);
		
		JButton btnUse_1 = new JButton("Use");
		btnUse_1.setBounds(216, 101, 89, 23);
		panel.add(btnUse_1);
		btnUse_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBox.getSelectedItem() == "1") {
					contentPane.setBackground(Color.YELLOW);
				}
				else if(comboBox.getSelectedItem() == "2") {
					dispose();
				}
			}
		});
		
		//
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxNewCheckBox.isSelected()) {
					lblTestItOn.setVisible(true);
				}
				else {
					lblTestItOn.setVisible(false);
				}
			}
		});
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Advanced", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(null);
		panel_2.setBounds(134, 118, 182, 79);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		JLabel lblDevOptions = new JLabel("Dev Options:");
		lblDevOptions.setBounds(55, 11, 74, 14);
		panel_2.add(lblDevOptions);
		
		JToggleButton tglbtnRainbowToogle = new JToggleButton("Rainbow toggle");
		tglbtnRainbowToogle.setBounds(33, 36, 121, 23);
		panel_2.add(tglbtnRainbowToogle);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 189, 26);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		panel_2.setVisible(false);
		
		JCheckBox chckbxActivateAllOptions = new JCheckBox("Activate all Options");
		chckbxActivateAllOptions.setBounds(7, 2, 157, 23);
		panel_3.add(chckbxActivateAllOptions);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 26, 410, 84);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblLayout_1 = new JLabel("Platzhalter");
		lblLayout_1.setBounds(29, 3, 70, 14);
		panel_4.add(lblLayout_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(29, 28, 46, 20);
		panel_4.add(comboBox_2);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3"}));
		
		JButton btnUse_2 = new JButton("use");
		btnUse_2.setBounds(10, 59, 89, 23);
		panel_4.add(btnUse_2);
		
		JLabel lblUser_1 = new JLabel("User");
		lblUser_1.setBounds(162, 3, 46, 14);
		panel_4.add(lblUser_1);
		
		JLabel lblPassword_1 = new JLabel("Password");
		lblPassword_1.setBounds(283, 3, 65, 14);
		panel_4.add(lblPassword_1);
		
		Password = new JTextField();
		Password.setBounds(262, 28, 86, 20);
		panel_4.add(Password);
		Password.setColumns(10);
		
		User = new JTextField();
		User.setToolTipText("");
		User.setBounds(122, 28, 86, 20);
		panel_4.add(User);
		User.setColumns(10);
		
		JButton btnLogIn_1 = new JButton("Log In");
		btnLogIn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(User.getText());
				System.out.println(Password.getText());
				if(User.getText() == "admin" && Password.getText() == "passwort") {
					panel_2.setVisible(true);
				}
			}
		});
		btnLogIn_1.setBounds(189, 59, 89, 23);
		panel_4.add(btnLogIn_1);
		panel_4.setVisible(false);
		
		chckbxActivateAllOptions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxActivateAllOptions.isSelected()) {
					panel_4.setVisible(true);
				}
				else if(!chckbxActivateAllOptions.isSelected()){
					panel_4.setVisible(false);
				}
			}
		});
	}
}
