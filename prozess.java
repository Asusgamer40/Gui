package gui;

public class prozess {
	String Prozessname;
	int Wartezeit1;
	int Wartezeit2;
	int Priorität;
	int Rechenzeit1;
	int Rechenzeit2;
	int Rechenzeit3;
	String state;
	int rechnetSeit;

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
		Priorität = Priorität-2;
	}
	public void verringereWartzeit() {
		if(Wartezeit2 == 0) {
			Wartezeit1--;
		}
		else {
			Wartezeit2--;
		}
	}
	public void verringereRechenzeit() {
		if(Rechenzeit3 == 0 && Rechenzeit2 == 0 && Rechenzeit1 != 0) {
			Rechenzeit1--;
		}
		else if (Rechenzeit3 == 0 && Rechenzeit2 != 0){
			Rechenzeit2--;
		}
		else if(Rechenzeit3 != 0) {
			Rechenzeit3--;
		}
	}
}
