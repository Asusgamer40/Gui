package gui;

public class prozess {
	String Prozessname;
	String Wartezeit1;
	String Wartezeit2;
	String Priorität;
	String Rechenzeit1;
	String Rechenzeit2;
	String Rechenzeit3;

	public prozess(String name, String w1, String w2, String r1, String r2, String r3, String prio) {
		this.Prozessname = name;
		this.Wartezeit1 = w1;
		this.Wartezeit2 = w2;
		this.Priorität = prio;
		this.Rechenzeit1 = r1;
		this.Rechenzeit2 = r2;
		this.Rechenzeit3 = r3;
	}
}
