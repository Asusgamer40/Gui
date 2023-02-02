package gui;

import java.util.ArrayList;


public class model {
	private String[][] inhalt = {
			{".", ".",".", ".",".", ".",".", ".",".", ".",".", ".",".", ".",".", ".",".", ".",".", ".","."},
			{"-", "-","-", "-","-", "-","-", "-","-", "-","-", "-","-", "-","-", "-","-", "-","-", "-","-"},
			{".", ".",".", ".",".", ".",".", ".",".", ".",".", ".",".", ".",".", ".",".", ".",".", ".","."},
			{"-", "-","-", "-","-", "-","-", "-","-", "-","-", "-","-", "-","-", "-","-", "-","-", "-","-"},
			{".", ".",".", ".",".", ".",".", ".",".", ".",".", ".",".", ".",".", ".",".", ".",".", ".","."},
			{"-", "-","-", "-","-", "-","-", "-","-", "-","-", "-","-", "-","-", "-","-", "-","-", "-","-"}
		};
	view vi;
	public model(view v) {
		vi = v;
	}
	
	ArrayList<prozess> Prozesse = new ArrayList<>();
	
	
	public ArrayList<prozess> getProzessearray(){
		return Prozesse;
	}
	
	public void setProzesse(prozess p) {
		Prozesse.add(p);
	}
	public prozess getProzesse(int stelle) {
		return Prozesse.get(stelle);
	}
	
	private String[] titel = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};

	public String[][] getmodel(){
		return inhalt;
	}
	public String[] gettitel() {
		return titel;
	}
	public void setinhalt(int row, int col, String text) {
		inhalt[row][col] = text;
	}
	public String getinhalt(int a,int b){
		return inhalt[a][b];
	}
}
