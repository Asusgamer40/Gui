package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controller {

	public controller(model m, view v) {
		v.getAddProcessBTN_1().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		v.getAddProcessBTN().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				v.getinternalFrame().setVisible(true);
			}
		});
		v.getbtnNewButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = v.gettxtprocessname().getText();
				Object r1 = v.getcomboBox().getModel().getSelectedItem();
				Object w1 = v.getcomboBox().getModel().getSelectedItem();
				Object r2 = v.getcomboBox().getModel().getSelectedItem();
				Object w2 = v.getcomboBox().getModel().getSelectedItem();
				Object r3 = v.getcomboBox().getModel().getSelectedItem();
				Object w3 = v.getcomboBox().getModel().getSelectedItem();
				
			}
		});
	}

	public void initController() {
		// TODO Auto-generated method stub
		
	}
	
	
}