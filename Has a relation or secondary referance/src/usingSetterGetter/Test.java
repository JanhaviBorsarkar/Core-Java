package usingSetterGetter;

public class Test 
{
	public static void main(String args[])
	{
		Address adr = new Address();
		adr.setArea("Karvenagar");
		adr.setCity("Pune");
		
		Student s = new Student();
		s.setRollno(1);
		s.setName("ABC");
		s.setAddr(adr);
		
		System.out.println("Rollno: " +s.getRollno());
		System.out.println("Name: " +s.getName());
		System.out.println("Area: " +s.getAddr().getArea());
		System.out.println("City: " +s.getAddr().getCity());
	}
}
