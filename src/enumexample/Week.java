package enumexample;

public class Week {
	public Day day;
	
	public Week() {}
	public Week(Day day) {
		this.day = day;
	}
	
	public void taskToDo(Day day) {
		this.day = day;
		switch(day) {
		       case Monday:
		           System.out.println("Class is in session-1");
		           break;
		       case Tuesday:
			       System.out.println("Home Work Start");
			       break;
		       case Wednesday:
			       System.out.println("Submit Home Work");
			       break;
		       case Thursday:
			       System.out.println("Class is in session-2");
			       break;
		       case Friday:
			       System.out.println("Group Discussion-1");
			       break;
		       case Saturday:
			       System.out.println("Group Discussion-2");
			       break;
		       case Sunday:
			       System.out.println("Codelab is partial focus");
			       break;     
		       default:
			       System.out.println("not a valid day !");
			       break;
			
		}
	}

}
