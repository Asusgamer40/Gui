package MVCTable;

import com.google.gson.Gson;

public class app {
	public static void main (String[] args) {
		
		model m = new model();
		view v = new view();
		controller c = new controller(m, v);
		c.initController();
		v.setVisible(true);
		
		m.data = gson.fromJson("C:\\Users\\m.roensch\\Desktop\\MVCTable\\src/person.json");
	}
}
