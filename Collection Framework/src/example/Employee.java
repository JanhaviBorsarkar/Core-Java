package example;

public class Employee 
{
	private int e_id;
	private String e_name;
	
	public Employee(int e_id, String e_name) 
	{
		super();
		this.e_id = e_id;
		this.e_name = e_name;
	}
	
	@Override
	public String toString() 
	{
		return "Employee [e_id=" + e_id + ", e_name=" + e_name + "]";
	}
}
