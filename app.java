package gui;

public class app {
	public static void main (String[] args) {
		
		model m = new model();
		view v = new view();
		prozess p = new prozess(null, null, null, null, null, null, null);
		controller c = new controller(m, v, p);
		c.initController();
		v.setVisible(true);
	}
}
