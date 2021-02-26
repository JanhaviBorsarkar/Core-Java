public class Test 
{
	public static void main(String[] args) 
	{
		Address adr = new Address();
		adr.setCity("Pune");
		adr.setArea("Karve");
		
		Student s = new Student();
		s.setRollno(1);
		s.setName("ABC");
		s.setAddr(adr);
		
		System.out.println("Roll number: " +s.getRollno());
		System.out.println("Name: " +s.getName());
		System.out.println("Area: " +s.getAddr().getArea());
		System.out.println("City: " +s.getAddr().getCity());
	}

}
