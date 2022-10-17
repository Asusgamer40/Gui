package gui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class controller {

	private view view;
	
	
	public void initController() {
		view.getframe().addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				dialogEnde(view);
			}
		});
		view.getrdbtnNewRadioButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setRadioButtonRed(view);
			}
		});
		
		//
		view.getrdbtnBlue().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setRadioButtonBlue(view);
			}
		});
		
		//
		view.getrdbtnGreen().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setRadioButtonGreen(view);
			}
		});
		view.getbtnUse_1().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				doComboBox(view);
			}
		});
		
		//
		view.getchckbxNewCheckBox().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				showLabel(view);
			}
		});
		view.getbtnUse_2().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setCursorComboBox(view);
				
			}
		});
		view.getbtnNewButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setList(view);
			}
		});
		view.getbtnNewButton_1().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearList(view);
			}
		});
		view.getslider().addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent e) {
				setSlider(view);
			}
		});
		view.getchckbxActivateAllOptions().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				activateOption(view);
			}
		});
		view.getbtnLogIn_1().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resetCursor(view);			}
		});
	}
	public controller(view v) {
		view = v;
		 
	
	
}
	
	
	public void dialogEnde(view v) {
		int result = JOptionPane.showConfirmDialog(v.getframe(),  "Really?", "isch Wörde Gärne wissä ob si schlissä wollä?", JOptionPane.YES_NO_OPTION);
		if(result == 0) {
			v.dispose();
		}
	}
	public void setRadioButtonRed(view v) {
		if(v.getrdbtnNewRadioButton().isSelected()) {
			v.getcontentPane().setBackground(Color.RED);
			v.getrdbtnBlue().setSelected(false);
			v.getrdbtnGreen().setSelected(false);
		}
	}
	public void setRadioButtonBlue(view v) {
		if(v.getrdbtnBlue().isSelected()) {
			v.getcontentPane().setBackground(Color.BLUE);
			v.getrdbtnNewRadioButton().setSelected(false);
			v.getrdbtnGreen().setSelected(false);
		}
	}
	public void setRadioButtonGreen(view v) {
		if(v.getrdbtnGreen().isSelected()) {
			v.getcontentPane().setBackground(Color.GREEN);
			v.getrdbtnNewRadioButton().setSelected(false);
			v.getrdbtnBlue().setSelected(false);
		}
	}
	public void doComboBox(view v) {
		if(v.getcomboBox().getSelectedItem() == "1") {
			v.getcontentPane().setBackground(Color.YELLOW);
		}
		else if(v.getcomboBox().getSelectedItem() == "2") {
			v.dispose();
		}
	}
	public void showLabel(view v) {
		if(v.getchckbxNewCheckBox().isSelected()) {
			v.getlblTestItOn().setVisible(true);
		}
		else {
			v.getlblTestItOn().setVisible(false);
		}
	}
	public void setCursorComboBox(view v) {
		if(v.getcomboBox_2().getSelectedItem() == "1") {
			v.setCursor(Cursor.CROSSHAIR_CURSOR);
		}
		if(v.getcomboBox_2().getSelectedItem() == "2") {
			v.setCursor(Cursor.HAND_CURSOR);
		}
		if(v.getcomboBox_2().getSelectedItem() == "3") {
			v.setCursor(Cursor.MOVE_CURSOR);
		}
	}
	public void setList(view v) {
		if(v.gettextField().getText() != "") {
			v.getmodel().addElement(v.gettextField().getText());
			v.getlist().setModel(v.getmodel());
		}
	}
	public void clearList(view v) {
		v.getmodel().removeAllElements();
	}
	public void setSlider(view v) {
		if(v.getslider().getValue() == 100) {
			v.getlblNewLabel_4().setVisible(true);
		}
	}
	public void activateOption(view v) {
		if(v.getchckbxActivateAllOptions().isSelected()) {
			v.getpanel_4().setVisible(true);
		}
		else if(!v.getchckbxActivateAllOptions().isSelected()){
			v.getpanel_4().setVisible(false);
		}
	}
	public void resetCursor(view v) {
		v.setCursor(Cursor.DEFAULT_CURSOR);
	}
}