package gui;

public class prozess {
	String Prozessname;
	String Wartezeit;
	String Priorität;
	String Rechenzeit;

	public prozess(String name, String WZ, String Prio, String RZ) {
		this.Prozessname = name;
		this.Wartezeit = WZ;
		this.Priorität = Prio;
		this.Rechenzeit = RZ;
	}
}
