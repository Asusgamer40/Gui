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
	public int wartetSeit;
	public boolean fertig;
	public boolean anzeigePrio;
	public boolean prioMinus;

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
	public void verringereWartzeit() {
		if(Rechenzeit1 == 0 && Rechenzeit2 != 0) {
			if(Wartezeit1 != 0) {
				Wartezeit1--;
				state = "I";
				wartetSeit = 5;
				if(Wartezeit1 == 0) {
					wartetSeit = 0;
				}
			}
			else {
				state = "O";
				wartetSeit = 0;
			}
		}
		else if(Rechenzeit2 == 0) {
			if(Wartezeit2 != 0){
				Wartezeit2--;
				state = "I";
				wartetSeit = 5;
				if(Wartezeit2 == 0) {
					wartetSeit = 0;
				}
			}
			else {
				state = "O";
				wartetSeit = 0;
			}
		}
	}
	public void verringereRechenzeit() {
		if(Rechenzeit1 != 0) {
			anzeigePrio = false;
			Rechenzeit1--;
			prioMinus = false;
			if(Rechenzeit1 == 0) {
				anzeigePrio = true;
				rechnetSeit = 5;
				Priorität--;
				Priorität--;
				prioMinus = true;
			}
			else if(rechnetSeit == 5 && prioMinus == false) {
				anzeigePrio = true;
				Priorität--;
				Priorität--;
			}
		}
		else if (Rechenzeit2 != 0 && Wartezeit1 == 0){
			anzeigePrio = false;
			Rechenzeit2--;
			prioMinus = false;
			if(Rechenzeit2 == 0) {
				anzeigePrio = true;
				rechnetSeit = 5;
				Priorität--;
				Priorität--;
				prioMinus = true;
			}
			else if(rechnetSeit == 5 && prioMinus == false) {
				anzeigePrio = true;
				Priorität--;
				Priorität--;
			}
		}
		else if(Rechenzeit3 != 0 && Wartezeit2 == 0) {
			anzeigePrio = false;
			Rechenzeit3--;
			prioMinus = false;
			if(Rechenzeit3 == 0) {
				anzeigePrio = true;
				rechnetSeit = 5;
				Priorität--;
				Priorität--;
				prioMinus = true;
			}
			else if(fertig) {
				anzeigePrio = true;
				Priorität--;
				Priorität--;
			}	
		}
	}
	public void letzterprozess() {
		verringereWartzeit();
		verringereRechenzeit();
	}
}
