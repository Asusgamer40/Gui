package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

public class controller {
	
	int o;
	int a;
	private view v;
	private model m;
	private int werIstDran;
	private boolean ok0;
	private boolean ok1;
	private boolean ok2;
	
	String var1;
	String var2;
	String var3;
	
	public controller(model m, view v) {
		this.m = m;
		this.v = v;

	}

	public void initController() {


		a = 0;
		
		m.setProzesse(new prozess("",0,0,0,0,0,0));
		m.setProzesse(new prozess("",0,0,0,0,0,0));
		m.setProzesse(new prozess("",0,0,0,0,0,0));
		
		
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
								
				if(v.getcomboBox_1().getSelectedIndex() != 0 && v.getcomboBox().getSelectedIndex() != 0 && v.gettxtprocessname().getText() != "") {
						if(a < 3) {
							prozess p1 = new prozess(v.gettxtprocessname().getText(), v.getcomboBox_2().getSelectedIndex()-1, v.getcomboBox_4().getSelectedIndex()-1, v.getcomboBox_1().getSelectedIndex(), v.getcomboBox_3().getSelectedIndex()-1, v.getcomboBox_5().getSelectedIndex()-1, v.getcomboBox().getSelectedIndex());
							m.setProzesse(p1);
							m.getProzesse(a).resetRechnetSeit();
							a++;		
						
						switch(a) {
						case 1:
							String text = v.gettxtprocessname().getText();
							v.setlblNewLabel_16(text);
							break;
						case 2:
							String text1 = v.gettxtprocessname().getText();
							v.setlblNewLabel_17(text1);
							break;
						case 3:
							String text2 = v.gettxtprocessname().getText();
							v.setlblNewLabel_18(text2);
							break;
						}
						v.getcomboBox_1().getModel().setSelectedItem("");
						v.getcomboBox_2().getModel().setSelectedItem("");
						v.getcomboBox_3().getModel().setSelectedItem("");
						v.getcomboBox_4().getModel().setSelectedItem("");
						v.getcomboBox_5().getModel().setSelectedItem("");
						v.getcomboBox().getModel().setSelectedItem("");
						v.gettxtprocessname().setText("");
						}
					}
				else {
					System.out.println("schlecht");
				}
				}
			});
		

		v.getrunBTN().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
					for(o = 0; o < 21; o++) {
						
						scheduler(o);
						
						var1 = m.getProzesse(0).state;
						var2 = m.getProzesse(1).state;
						var3 = m.getProzesse(2).state;
						
						fillblock(o, var1, var2, var3);
						v.setTableArray(m.getmodel());
						v.getDTM().fireTableDataChanged();
						//waitXms(300);
						}
					
					int rechenzeitDa0 = m.getProzesse(0).Rechenzeit1 + m.getProzesse(0).Rechenzeit2 + m.getProzesse(0).Rechenzeit3;
					int rechenzeitDa1 = m.getProzesse(1).Rechenzeit1 + m.getProzesse(1).Rechenzeit2 + m.getProzesse(1).Rechenzeit3;
					int rechenzeitDa2 = m.getProzesse(2).Rechenzeit1 + m.getProzesse(2).Rechenzeit2 + m.getProzesse(2).Rechenzeit3;
					System.out.println(rechenzeitDa0+rechenzeitDa1+rechenzeitDa2);
					
					/*
					for(int ü = 0; ü < 6; ü++) {
						for(int ö = 0; ö < 21; ö++) {
							System.out.print(m.getinhalt(ü, ö)); 
							}
						System.out.println("");
						}
						*/
					}				
			});
		
	}
	
	public void waitXms(int x) {
		try {
			TimeUnit. MILLISECONDS. sleep(x);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}
	
	public void fillblock(int time, String text1,String text2,String text3) {
		m.setinhalt(0, time, text1);
		m.setinhalt(2, time, text2);
		m.setinhalt(4, time, text3);
	}	
	
	public void scheduler(int p) {
		
		
		int rechenzeitIstDa0 = m.getProzesse(0).Rechenzeit1 + m.getProzesse(0).Rechenzeit2 + m.getProzesse(0).Rechenzeit3;
		int rechenzeitIstDa1 = m.getProzesse(1).Rechenzeit1 + m.getProzesse(1).Rechenzeit2 + m.getProzesse(1).Rechenzeit3;
		int rechenzeitIstDa2 = m.getProzesse(2).Rechenzeit1 + m.getProzesse(2).Rechenzeit2 + m.getProzesse(2).Rechenzeit3;
		
		int wartezeitIstDa0 = m.getProzesse(0).Wartezeit1 + m.getProzesse(0).Wartezeit2;
		int wartezeitIstDa1 = m.getProzesse(1).Wartezeit1 + m.getProzesse(1).Wartezeit2;
		int wartezeitIstDa2 = m.getProzesse(2).Wartezeit1 + m.getProzesse(2).Wartezeit2;
		
		if(rechenzeitIstDa0 == 0) {
			m.getProzesse(0).Priorität = 0;
			if(wartezeitIstDa0 == 0) {
				m.getProzesse(0).fertig = true;
			}
		}
		if(rechenzeitIstDa1 == 0) {
			m.getProzesse(1).Priorität = 0;
			if(wartezeitIstDa1 == 0) {
				m.getProzesse(1).fertig = true;
			}
		}
		if(rechenzeitIstDa2 == 0) {
			m.getProzesse(2).Priorität = 0;
			if(wartezeitIstDa2 == 0) {
				m.getProzesse(2).fertig = true;
			}
		}

		if(!m.getProzesse(0).fertig && ! m.getProzesse(1).fertig || !m.getProzesse(0).fertig && !m.getProzesse(2).fertig || !m.getProzesse(2).fertig && !m.getProzesse(1).fertig) {
			if(m.getProzesse(0).rechnetSeit < 5 && m.getProzesse(0).Priorität >= m.getProzesse(1).Priorität && m.getProzesse(0).Priorität >= m.getProzesse(2).Priorität && rechenzeitIstDa0 != 0) {
				werIstDran = 0;
			}
			else if(m.getProzesse(1).rechnetSeit < 5 && m.getProzesse(1).Priorität >= m.getProzesse(2).Priorität && m.getProzesse(1).Priorität >= m.getProzesse(0).Priorität && rechenzeitIstDa1 != 0) {
				werIstDran = 1;
			}
			else if(m.getProzesse(2).rechnetSeit < 5 && m.getProzesse(2).Priorität >= m.getProzesse(0).Priorität && m.getProzesse(2).Priorität >= m.getProzesse(1).Priorität && rechenzeitIstDa2 != 0) {
				werIstDran = 2;
			}
			else {
				werIstDran = 5;
				System.out.println(m.getProzesse(2).rechnetSeit +""+ m.getProzesse(2).Priorität +""+ m.getProzesse(1).Priorität +""+ m.getProzesse(0).Priorität +""+ rechenzeitIstDa2);
			}
		}
		else {
			if(m.getProzesse(0).fertig &&  m.getProzesse(1).fertig) {
					m.getProzesse(2).verringereRechenzeit();
					m.getProzesse(2).verringereWartzeit();
			}
			else if(rechenzeitIstDa1+wartezeitIstDa1 != 0) {
					m.getProzesse(1).verringereRechenzeit();
					m.getProzesse(1).verringereWartzeit();
			}
			else {
					m.getProzesse(0).verringereRechenzeit();
					m.getProzesse(0).verringereWartzeit();				
			}
		}
		
		if(werIstDran == 0) {
			
			
				m.getProzesse(0).setState("X");
				m.getProzesse(1).setState("O");
				m.getProzesse(2).setState("O");
				
				m.getProzesse(0).verringereRechenzeit();
			
				m.getProzesse(0).erhöheRechnetSeit();
				
				m.getProzesse(1).resetRechnetSeit();
				m.getProzesse(2).resetRechnetSeit();
			
				
				m.getProzesse(1).verringereWartzeit();
				m.getProzesse(2).verringereWartzeit();
				
				}
		else if(werIstDran == 1) {

			
				m.getProzesse(0).setState("O");
				m.getProzesse(1).setState("X");
				m.getProzesse(2).setState("O");
				
				m.getProzesse(1).verringereRechenzeit();
			
				m.getProzesse(1).erhöheRechnetSeit();
				
				m.getProzesse(0).resetRechnetSeit();
				m.getProzesse(2).resetRechnetSeit();
			
			
				m.getProzesse(0).verringereWartzeit();
				m.getProzesse(2).verringereWartzeit();
			
	
		}
		else if(werIstDran == 2) {

			
				m.getProzesse(0).setState("O");
				m.getProzesse(1).setState("O");
				m.getProzesse(2).setState("X");
				
				m.getProzesse(2).verringereRechenzeit();
			
				m.getProzesse(2).erhöheRechnetSeit();
				
				m.getProzesse(1).resetRechnetSeit();
				m.getProzesse(0).resetRechnetSeit();
			
				m.getProzesse(1).verringereWartzeit();
				m.getProzesse(0).verringereWartzeit();
				

		}
		else {
			
			m.getProzesse(0).setState("O");
			m.getProzesse(1).setState("O");
			m.getProzesse(2).setState("O");
		
		}
		
		if(p !=  0) {
			if(werIstDran != 0 && m.getinhalt(0, p-1) == "X") {
				m.setinhalt(1, p-1, ""+m.getProzesse(0).Priorität+"");
			}
			else if(werIstDran != 1 && m.getinhalt(2, p-1) == "X") {
				m.setinhalt(3, p-1, ""+m.getProzesse(1).Priorität+"");
			}
			else if(werIstDran != 2 && m.getinhalt(4, p-1) == "X") {
				m.setinhalt(5, p-1, ""+m.getProzesse(2).Priorität+"");
			}
		}
		
		System.out.print(m.getProzesse(0).rechnetSeit);
		System.out.print(m.getProzesse(1).rechnetSeit);
		System.out.print(m.getProzesse(2).rechnetSeit);
		System.out.println();
	}
}