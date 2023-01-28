package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class controller {
	int a;
	
	public controller(model m, view v, prozess p) {
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
				String r1 = v.getcomboBox_1().getModel().getSelectedItem().toString();
				String w1 = v.getcomboBox_2().getModel().getSelectedItem().toString();
				String r2 = v.getcomboBox_3().getModel().getSelectedItem().toString();
				String w2 = v.getcomboBox_4().getModel().getSelectedItem().toString();
				String r3 = v.getcomboBox_5().getModel().getSelectedItem().toString();
				String prio = v.getcomboBox().getModel().getSelectedItem().toString();
				if(r1 != "-Calculatingtime 1-" && r2 != "-Calculatingtime 2-" && r3 != "-Calculatingtime 3-" && w1 != "-Waitingtime 1-" && w2 != "-Waitingtime 2-" && prio != "-Priority-" && name != "-Processname-") {
					if(r1 != "" && r2 != "" && r3 != "" && w1 != "" && w2 != "" && prio != "-" && name != "") {	
					prozess p1 = new prozess(name, w1, w2, r1, r2, r3, prio);
					m.setProzesse(p1);
					System.out.println("Prozess:"+m.getProzesse(a).Prozessname+"Priorität:"+m.getProzesse(a).Priorität);
					a++;
					v.getcomboBox_1().getModel().setSelectedItem("");
					v.getcomboBox_2().getModel().setSelectedItem("");
					v.getcomboBox_3().getModel().setSelectedItem("");
					v.getcomboBox_4().getModel().setSelectedItem("");
					v.getcomboBox_5().getModel().setSelectedItem("");
					v.getcomboBox().getModel().setSelectedItem("");
					v.gettxtprocessname().setText("");	
					}
				}
			}
		});
		
		v.getrunBTN().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}

	public void initController() {
		// TODO Auto-generated method stub
		
	}
	
	
}