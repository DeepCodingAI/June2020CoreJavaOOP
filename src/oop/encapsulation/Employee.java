package oop.encapsulation;

public class Employee {
	private String empName;
    private int empId;
	private String empDOB;
	
	public Employee() {}
    public Employee(String empName, int empId, String empDOB) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empDOB = empDOB;
	}
    public Employee(String empName, int empId) {
		this.empName = empName;
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpDOB() {
		return empDOB;
	}
	public void setEmpDOB(String empDOB) {
		this.empDOB = empDOB;
	}
	
}
