package gui;

public class app {

	public static void main(String[] args) {
		view v = new view();
		controller c = new controller(v);
		c.initController();
		v.setVisible(true);
	}
}