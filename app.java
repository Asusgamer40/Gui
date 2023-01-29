package gui;

public class app {
	public static void main (String[] args) {
		
		view v = new view();
		model m = new model(v);
		prozess p = new prozess(null, 0, 0, 0, 0, 0, 0);
		controller c = new controller(m, v, p);
		c.initController();
		v.setVisible(true);
	}
}
