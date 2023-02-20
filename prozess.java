package gui;

public class prozess {
	String Prozessname;
	public int Wartezeit1;
	public int Wartezeit2;
	public int Priorität;
	public int Rechenzeit1;
	public int Rechenzeit2;
	public int Rechenzeit3;
	public String state;
	public int rechnetSeit;
	public boolean fertig;

	public prozess(String name, int w1, int w2, int r1, int r2, int r3, int prio) {
		this.Prozessname = name;
		this.Wartezeit1 = w1;
		this.Wartezeit2 = w2;
		this.Priorität = prio;
		this.Rechenzeit1 = r1;
		this.Rechenzeit2 = r2;
		this.Rechenzeit3 = r3;
	}
	
	public void setState(String zustand) {
		state = zustand;
	}
	public void erhöheRechnetSeit() {
		rechnetSeit++;
	}
	public void resetRechnetSeit() {
		rechnetSeit = 0;
	}
	public void veringerePrio() {
		Priorität = Priorität -2;
	}
	public void verringereWartzeit() {
		if(Rechenzeit1 == 0) {
			if(Wartezeit1 != 0) {
				Wartezeit1--;
				state = "I";
			}
			else {
				state = "O";
			}
		}
		else if(Rechenzeit2 == 0) {
			if(Wartezeit2 != 0){
				Wartezeit2--;
				state = "I";
			}
			else {
				state = "O";
			}
		}
	}
	public void verringereRechenzeit() {
		if(Rechenzeit1 != 0) {
			Rechenzeit1--;
			if(Rechenzeit1 == 0) {
				rechnetSeit = 5;
				Priorität = Priorität -2;
			}
		}
		else if (Rechenzeit2 != 0 && Wartezeit1 == 0){
			Rechenzeit2--;
			if(Rechenzeit2 == 0) {
				rechnetSeit = 5;
				Priorität = Priorität -2;
			}
		}
		else if(Rechenzeit3 != 0 && Wartezeit2 == 0) {
			Rechenzeit3--;
			if(Rechenzeit3 == 0) {
				rechnetSeit = 5;
				Priorität = Priorität -2;
			}
		}
	}
	public void letzterprozess() {
		verringereWartzeit();
		verringereRechenzeit();
	}
}
