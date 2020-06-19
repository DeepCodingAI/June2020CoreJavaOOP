package singleton;

import java.util.ArrayList;
import java.util.List;

public class DatabaseInstance {
	
	private DatabaseInstance() {}
	
	public static DatabaseInstance getInstance1() {
		return new DatabaseInstance();
	}
	public static DatabaseInstance getInstance2() {
		return new DatabaseInstance();
	}
	public static List<DatabaseInstance> getListOfInstances() {
		List<DatabaseInstance> listOfLicense = new ArrayList<DatabaseInstance>();
		for(int i=0; i<10; i++) {
		listOfLicense.add(new DatabaseInstance());
		}
		
		return listOfLicense;
	}
	public void connectDatabase() {
		System.out.println("Database is connected and ready to use");
	}
}
