package studentTask;

public class Test 
{
	public University setUDetails()
	{
		College c = new College();
		c.c_id = 1;
		c.c_name = "JNEC";
		
		University u = new University();
		u.dte_code = 1234;
		u.u_name = "BAMU";
		u.clg = c;
		return u;
	}
	public void getUDetails()
	{
		Test t = new Test();
		University u1 = t.setUDetails();
		System.out.println("University code is " +u1.dte_code);
		System.out.println("University name is " +u1.u_name);
		System.out.println("College code is " +u1.clg.c_id);
		System.out.println("College name is " +u1.clg.c_name);
	}
	public static void main(String args[])
	{
		Test t1 = new Test();
		t1.getUDetails();
	}
}
