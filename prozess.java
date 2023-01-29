package gui;

public class prozess {
	String Prozessname;
	int Wartezeit1;
	int Wartezeit2;
	int Priorität;
	int Rechenzeit1;
	int Rechenzeit2;
	int Rechenzeit3;

	public prozess(String name, int w1, int w2, int r1, int r2, int r3, int prio) {
		this.Prozessname = name;
		this.Wartezeit1 = w1;
		this.Wartezeit2 = w2;
		this.Priorität = prio;
		this.Rechenzeit1 = r1;
		this.Rechenzeit2 = r2;
		this.Rechenzeit3 = r3;
	}
}
