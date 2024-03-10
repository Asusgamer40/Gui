package gui;

public class app {
	public static void main (String[] args) {
		
		view v = new view();
		model m = new model(v);
		controller c = new controller(m, v);
		c.initController();
		v.setVisible(true);
	}
}
