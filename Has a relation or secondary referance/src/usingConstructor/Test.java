package usingConstructor;

public class Test 
{
	public static void main(String args[])
	{
		Address adr = new Address("Pune", "Karvenagar");
		//System.out.println(adr);
		
		Student stu = new Student(1, "ABC", adr);
		
		System.out.println("Rollno: " +stu.rollno);
		System.out.println("Name: " +stu.name);
		System.out.println("Area: " +stu.addr.area);
		System.out.println("City: " +stu.addr.city);
	}
}
