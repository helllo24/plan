package employee;

public class EmployeDetails {
	
	private int id;
	private String name;
	private String dept;
	private int salary;
	private int exp;
	
	public EmployeDetails(int id,String name,String dept,int salary,int exp) {
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
		this.exp=exp;
		
	}
		public int getId() {
			return id;
			
		}
		
		public String getName() {
			return name;
		}
		
		public String getDept() {
			return dept;
			
		}
		
		public int getSalary() {
			return salary;
		}
		
	
		public int getExp() {
			return exp;
		}
	
	
	@Override
	public String  toString() {
		 return "EmployeDetails{id=" + id + ", name='" + name + "' , dept='" + dept + "',salary='" + salary + "',exp='" + exp + "}";
		
	}

}
