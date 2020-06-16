package oop.encapsulation;

public class TestEmployee {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setEmpName("Ahsan");
		emp1.setEmpDOB("01-02-1990");
		emp1.setEmpId(101);
		System.out.println(emp1.getEmpName()+ " "+emp1.getEmpId()+ " "+ emp1.getEmpDOB());
		
		Employee emp2 = new Employee();
		emp2.setEmpName("Joy");
		emp2.setEmpDOB("09-08-1992");
		emp2.setEmpId(102);
		System.out.println(emp2.getEmpName()+ " "+emp2.getEmpId()+ " "+ emp2.getEmpDOB());
		
		Employee emp3 = new Employee("Angel", 103, "03-010-1995");
		System.out.println(emp3.getEmpName()+ " "+emp3.getEmpId()+ " "+ emp3.getEmpDOB());
		
		Employee emp4 = new Employee("Angel", 103);
		System.out.println(emp4.getEmpName()+ " "+emp4.getEmpId()+ " "+ emp4.getEmpDOB());

	}

}
