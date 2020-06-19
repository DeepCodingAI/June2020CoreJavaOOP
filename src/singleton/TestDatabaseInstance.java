package singleton;

import java.util.List;

public class TestDatabaseInstance {

	public static void main(String[] args) {
		DatabaseInstance dataBaseInstance1 = DatabaseInstance.getInstance1();
		dataBaseInstance1.connectDatabase();
		
		List<DatabaseInstance> listOflicense = DatabaseInstance.getListOfInstances();
		listOflicense.get(1).connectDatabase();
	}

}
