package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

public class controller {
	
	int a;
	private view v;
	private model m;
	private prozess p;
	String name;
	int r1;
	int r2;
	int r3;
	int w1;
	int w2;
	int prio;
	String var1;
	String var2;
	String var3;
	String calculating;
	Boolean waiting1;
	Boolean mustwait1;
	Boolean waiting2;
	Boolean mustwait2;
	Boolean waiting3;
	Boolean mustwait3;
	int P1;
	int P2;
	int P3;
	int RZ1;
	int RZ2;
	int RZ3;
	int WZ1;
	int WZ2;
	int WZ3;
	int WZ1_1;
	int WZ2_1;
	int WZ3_1;
	


	
	
	public controller(model m, view v, prozess p) {
		this.m = m;
		this.v = v;
		this.p = p;

	}

	public void initController() {


		a = 0;
		
		m.setProzesse(new prozess("",0,0,0,0,0,0));
		m.setProzesse(new prozess("",0,0,0,0,0,0));
		m.setProzesse(new prozess("",0,0,0,0,0,0));
		P1 = m.getProzesse(0).Priorität;
		P2 = m.getProzesse(1).Priorität;
		P3 = m.getProzesse(2).Priorität;
		RZ1 = m.getProzesse(0).Rechenzeit3;
		RZ2 = m.getProzesse(1).Rechenzeit3;
		RZ3 = m.getProzesse(2).Rechenzeit3;
		WZ1 = m.getProzesse(0).Wartezeit2;
		WZ2 = m.getProzesse(1).Wartezeit2;
		WZ3 = m.getProzesse(2).Wartezeit2;
		WZ1_1 = m.getProzesse(0).Wartezeit1;
		WZ2_1 = m.getProzesse(1).Wartezeit1;
		WZ3_1 = m.getProzesse(2).Wartezeit1;
		m.getProzessearray().clear();
	
		
		
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
				name = v.gettxtprocessname().getText();
				r1 =  v.getcomboBox_1().getSelectedIndex();
				w1 =  v.getcomboBox_2().getSelectedIndex()-1;
				r2 =  v.getcomboBox_3().getSelectedIndex()-1;
				w2 =  v.getcomboBox_4().getSelectedIndex()-1;
				r3 =  v.getcomboBox_5().getSelectedIndex()-1;
				prio = v.getcomboBox().getSelectedIndex();
				
				if(r1 != 0 && prio != 0 && name != "") {
						if(a < 3) {
							prozess p1 = new prozess(name, w1, w2, r1, r2, r3, prio);
							m.setProzesse(p1);
							//System.out.println("Prozess:"+m.getProzesse(a).Prozessname+"Priorität:"+m.getProzesse(a).Priorität);
							a++;
							v.getcomboBox_1().getModel().setSelectedItem("");
							v.getcomboBox_2().getModel().setSelectedItem("");
							v.getcomboBox_3().getModel().setSelectedItem("");
							v.getcomboBox_4().getModel().setSelectedItem("");
							v.getcomboBox_5().getModel().setSelectedItem("");
							v.getcomboBox().getModel().setSelectedItem("");
							v.gettxtprocessname().setText("");		
						
						switch(a) {
						case 1:
							v.setlblNewLabel_16(name);
							break;
						case 2:
							v.setlblNewLabel_17(name);
							break;
						case 3:
							v.setlblNewLabel_18(name);
							break;
						}
						}
					}
				else {
					System.out.println("schlecht");
				}
				}
			});
		

		v.getrunBTN().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					int o;
					for(o = 0; o < 21; o++) {
						
						scheduler();
						
						if(calculating == "Prozess1") {
							var1 = "X";
							P1 = P1-2;
						}
						else if(calculating == "Prozess2") {
							var2 = "X";
							P2 = P2-2;
						}
						else if(calculating == "Prozess3") {
							var3 = "X";
							P3 = P3-2;
						}
						
						if(waiting1 == true) {
							var1 = "I";
							if(WZ1 != 0) {
								WZ1--;
							}
							else if(WZ1_1 !=0) {
								WZ1_1--;
							}
						}
						if(mustwait1 == true) {
							var1 = "O";
						}
						if(waiting2 == true) {
							var2 = "I";
							if(WZ2 != 0) {
								WZ2--;
							}
							else if(WZ2_1 !=0) {
								WZ2_1--;
							}
						}
						if(mustwait2 == true) {
							var2 = "O";
						}
						if(waiting3 == true) {
							var3 = "I";
							if(WZ3 != 0) {
								WZ3--;
							}
							else if(WZ3_1 !=0) {
								WZ3_1--;
							}
						}
						if(mustwait3 == true) {
							var3 = "O";
						}
						
						fillblock(o, var1, var2, var3);
						//wait1s();
						}
					for(int ü = 0; ü < 6; ü++) {
						for(int ö = 0; ö < 21; ö++) {
							System.out.print(m.getinhalt(ü, ö)); 
							}
						System.out.println("");
						}
					}				
			});
		
	}
	
	public void wait1s() {
		try {
			TimeUnit. SECONDS. sleep(1);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void fillblock(int time, String text1,String text2,String text3) {
		m.setinhalt(0, time, text1);
		m.setinhalt(2, time, text2);
		m.setinhalt(4, time, text3);
	}	
	
	public void scheduler() {
		if(P1 > P2 && P1 >  P3){
			calculating = "Prozess1";
		}
		else if(P2 > P1 && P2 >  P3){
			calculating = "Prozess2";
		}
		else if(P3 > P1 && P3 >  P2){
			calculating = "Prozess3";
		}
		if(calculating != "Prozess1") {
			if(WZ1 != 0 || WZ1_1 != 0) {
				waiting1 = true;
				mustwait1 = false;
			}
			else if(WZ1 == 0 && WZ1_1 == 0) {
				mustwait1 = true;
				waiting1 = false;
			}
		}
		else if(calculating == "Prozess1") {
			mustwait1 = false;
			waiting1 = false;
		}
		if(calculating != "Prozess2") {
			if(WZ2 != 0 || WZ2_1 != 0) {
				waiting2 = true;
				mustwait2 = false;
			}
			else if(WZ2 == 0 && WZ2_1 == 0){
				mustwait2 = true;
				waiting2 = false;
			}
		}
		else if(calculating == "Prozess2") {
			mustwait2 = false;
			waiting2 = false;
		}
		if(calculating != "Prozess3") {
			if(WZ3 != 0 || WZ3_1 != 0) {
				waiting3 = true;
				mustwait3 = false;
			}
			else if(WZ3 == 0 && WZ3_1 == 0){
				mustwait3 = true;
				waiting3 = false;
			}
		}
		else if(calculating == "Prozess3") {
			mustwait3 = false;
			waiting3 = false;
		}
	}

}