package gui;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JSlider;

public class view extends JFrame {

	
	//create
	private JFrame frame;
    private JLabel lblSecrets;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnBlue;
	private JRadioButton rdbtnGreen;
	private JLabel lblNewLabel_1;
	private JCheckBox chckbxNewCheckBox;
    private JComboBox comboBox;
    private JLabel lblTestItOn;
    private JButton btnUse_1;
    private JPanel panel_1;
    private JPanel panel_3;
    private JCheckBox chckbxActivateAllOptions;
    private JPanel panel_4;
    private JLabel lblLayout_1;
    private JComboBox comboBox_2;
    private JButton btnUse_2;
    private JButton btnLogIn_1;
    private JPanel panel_5;
    private JTextArea textArea;
    private JList list;
    private DefaultListModel model;
    private JButton btnNewButton;
    private JButton btnNewButton_1;
    private JLabel lblNewLabel_2;
    private JLabel lblNewLabel_3;
    private JLabel lblNewLabel_4;
    private JSlider slider;
    private JPanel contentPane;
	private JTextField textField1;

    public view() {
    	frame = new JFrame();
	contentPane = new JPanel();
	
	 tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	 panel = new JPanel();
	 lblNewLabel = new JLabel("Color:");
	 rdbtnNewRadioButton = new JRadioButton("Red");
	 rdbtnBlue = new JRadioButton("Blue");
	 rdbtnGreen = new JRadioButton("Green");
	 lblNewLabel_1 = new JLabel("Hints:");
	 chckbxNewCheckBox = new JCheckBox("Activate");
	 lblSecrets = new JLabel("Secrets:");
	 comboBox = new JComboBox();
	 lblTestItOn = new JLabel("Test it on Your own ;)");
	 btnUse_1 = new JButton("Use");
	 panel_1 = new JPanel();
	 panel_3 = new JPanel();
	 chckbxActivateAllOptions = new JCheckBox("Activate all Options");
	 panel_4 = new JPanel();
	 lblLayout_1 = new JLabel("Cursor:");
	 comboBox_2 = new JComboBox();
	 btnUse_2 = new JButton("Use");
	 btnLogIn_1 = new JButton("Reset");
	 panel_5 = new JPanel();
	 textArea = new JTextArea();
     list = new JList();
	 model = new DefaultListModel();
	 btnNewButton = new JButton("Add");
	 btnNewButton_1 = new JButton("Remove");
	 lblNewLabel_2 = new JLabel("Notice:");
	 lblNewLabel_3 = new JLabel("Pull up");
	 lblNewLabel_4 = new JLabel("Very well pulled!");
	 slider = new JSlider();
	 textField1 = new JTextField();
	
	
	//set
	 

	contentPane.setBackground(Color.RED);
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	contentPane.setLayout(null);
	
	 
     setTitle("Overview");
	    setDefaultCloseOperation(view.DO_NOTHING_ON_CLOSE);
	    setBounds(100, 100, 450, 300);
     frame.setVisible(true);
     setContentPane(contentPane);
	
	tabbedPane.setBounds(10, 11, 410,230);
	
	tabbedPane.addTab("Basic", null, panel, null);
	panel.setLayout(null);
	
	lblNewLabel.setBounds(10, 0, 99, 56);
	
	rdbtnNewRadioButton.setSelected(true);
	rdbtnNewRadioButton.setBounds(6, 41, 71, 65);
	
	rdbtnBlue.setBounds(6, 80, 71, 65);
	
	rdbtnGreen.setBounds(6, 121, 71, 65);
	
	lblNewLabel_1.setBounds(107, 21, 46, 14);
	
	chckbxNewCheckBox.setBounds(107, 62, 97, 23);
	
	lblSecrets.setBounds(224, 21, 63, 14);
	
	comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2"}));
	comboBox.setToolTipText("");
	comboBox.setBounds(224, 63, 63, 20);
	
	lblTestItOn.setBounds(97, 105, 126, 14);
	lblTestItOn.setVisible(false);
	
	btnUse_1.setBounds(216, 101, 89, 23);
	
	tabbedPane.addTab("Advanced", null, panel_1, null);
	
	panel_3.setBounds(0, 0, 189, 26);
	panel_3.setLayout(null);
	
	chckbxActivateAllOptions.setBounds(7, 2, 157, 23);
	
	panel_4.setBounds(138, 26, 123, 139);
	panel_4.setLayout(null);
	panel_4.setVisible(false);
	
	lblLayout_1.setBounds(29, 3, 70, 14);
	
	comboBox_2.setBounds(29, 28, 46, 20);
	comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3"}));
	
	btnUse_2.setBounds(10, 59, 89, 23);
	
	btnLogIn_1.setBounds(10, 93, 89, 23);
	
	panel_5.setLayout(null);
	
	textArea.setBounds(10, 37, 144, 150);
	
	list.setValueIsAdjusting(true);
	list.setBounds(164, 11, 112, 90);
	
	btnNewButton.setBounds(174, 145, 89, 23);
	
	btnNewButton_1.setBounds(174, 168, 89, 23);
	
	textField1.setBounds(174, 112, 86, 20);
	textField1.setColumns(10);
	
	lblNewLabel_2.setBounds(10, 12, 46, 14);
	
	lblNewLabel_3.setBounds(286, 12, 46, 14);
	
	lblNewLabel_4.setBounds(310, 95, 109, 28);
	lblNewLabel_4.setVisible(false);
	
	slider.setValue(0);
	slider.setOrientation(SwingConstants.VERTICAL);
	slider.setBounds(282, 30, 20, 157);
	
	
	
	//add
	contentPane.add(tabbedPane);
	
	tabbedPane.addTab("Basic", null, panel, null);
	
	contentPane.add(tabbedPane);
	
	tabbedPane.addTab("Basic", null, panel, null);
	
	panel.add(lblNewLabel);
	
	panel.add(rdbtnNewRadioButton);
	
	panel.add(rdbtnBlue);
	
	panel.add(rdbtnGreen);
	
	panel.add(lblNewLabel_1);
	
	panel.add(chckbxNewCheckBox);
	
	panel.add(lblSecrets);
	
	panel.add(comboBox);
	
	panel.add(lblTestItOn);
	
	panel.add(btnUse_1);
	
	tabbedPane.addTab("Advanced", null, panel_1, null);
	
	panel_1.add(panel_3);
	
	panel_3.add(chckbxActivateAllOptions);
	
	panel_1.add(panel_4);
	
	panel_4.add(lblLayout_1);
	
	panel_4.add(comboBox_2);
	
	panel_4.add(btnUse_2);
	
	panel_4.add(btnLogIn_1);
	
	tabbedPane.addTab("Other", null, panel_5, null);
	
	panel_5.add(textArea);
	
	panel_5.add(list);
	
	panel_5.add(btnNewButton);
	
	panel_5.add(btnNewButton_1);
	
	panel_5.add(textField1);
	
	panel_5.add(lblNewLabel_2);
	
	panel_5.add(lblNewLabel_3);
	
	panel_5.add(lblNewLabel_4);
	
	panel_5.add(slider);
	
	
    }
    public JFrame getframe() {
    	return frame;
    }
    public JRadioButton getrdbtnNewRadioButton() {
    	return rdbtnNewRadioButton;
    }
    public JRadioButton getrdbtnBlue() {
    	return rdbtnBlue;
    }
    public JRadioButton getrdbtnGreen() {
    	return rdbtnGreen;
    }
    public JButton getbtnUse_1() {
    	return btnUse_1;
    }
    public JCheckBox getchckbxNewCheckBox() {
    	return chckbxNewCheckBox;
    }
    public JButton getbtnUse_2() {
    	return btnUse_2;
    }
    public JButton getbtnNewButton() {
    	return btnNewButton;
    }
    public JButton getbtnNewButton_1() {
    	return btnNewButton_1;
    }
    public JSlider getslider() {
    	return slider;
    }
    public void setslider() {
    	this.slider = slider;
    }
    public JCheckBox getchckbxActivateAllOptions() {
    	return chckbxActivateAllOptions;
    }
    public JButton getbtnLogIn_1() {
    	return btnLogIn_1;
    }
    public JComboBox getcomboBox_2() {
    	return comboBox_2;
    }
    public JPanel getcontentPane() {
    	return contentPane;
    }
    public JComboBox getcomboBox() {
    	return comboBox;
    }
    public JLabel getlblTestItOn() {
    	return lblTestItOn;
    }
    public JTextField gettextField() {
    	return textField1;
    }
    public DefaultListModel getmodel() {
    	return model;
    }
    public JList getlist() {
    	return list;
    }
    public JLabel getlblNewLabel_4() {
    	return lblNewLabel_4;
    }
    public JPanel getpanel_4() {
    	return panel_4;
    }
}
