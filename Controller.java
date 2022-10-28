package B‰schd‰B‰g‰sch;

public class Controller {
	
	 private Model model; 

	  private View view; 

	  public Controller(Model m, View v) { 

	    model = m; 

	    view = v; 

	    initView(); 

	  }
	  public void initView() { 
		  view.getTable().setModel(this.model);
	  }
	  public void initController() { 

	  } 
}