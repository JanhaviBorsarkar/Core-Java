package secondaryReference;

public class Test 
{
	public static void main(String args[])
	{
		Address adr = new Address();
		adr.city = "Pune";
		adr.area = "Karvenagar";
		
		Student stu = new Student();
		stu.rollno = 1;
		stu.name = "ABC";
		stu.addr = adr;
		
		System.out.println("Roll number: " +stu.rollno);
		System.out.println("Name: " +stu.name);
		System.out.println("Area: " +stu.addr.area);
		System.out.println("City: " +stu.addr.city);
	}
}
