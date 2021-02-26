package companydetails;

public class Admin 
{
	public static void main(String args[])
	{
		Employee e = new Employee();
		e.e_id = 1;
		e.e_name = "ABC";
		e.designation = "Manager";
		e.department = "Business";
		e.salary = 40000;

		User u = new User();
		u.u_id = 1;
		u.u_name = "XYZ";
		u.u_address = "Somewhere";

		Company c = new Company();
		c.c_name = "PQR";
		c.c_product = "Something";
		c.c_address = "Pune";

		System.out.println("Employee details: ");
		System.out.println(e.e_id);
		System.out.println(e.e_name);
		System.out.println(e.designation);
		System.out.println(e.department);
		System.out.println(e.salary);
		
		System.out.println("\n");
		
		System.out.println("User details: ");
		System.out.println(u.u_id);
		System.out.println(u.u_name);
		System.out.println(u.u_address);
		
		System.out.println("\n");

		System.out.println("Company details: ");
		System.out.println(c.c_name);
		System.out.println(c.c_product);
		System.out.println(c.c_address);
	}
}
