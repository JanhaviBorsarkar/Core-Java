package calculator;

public class Calci 
{
	public Calci(float a, float b)
	{
		float add = a + b;
		System.out.println("Addition is: "+add);
		
		float sub = a - b;
		System.out.println("Subtraction is: "+sub);
		
		float mul = a * b;
		System.out.println("Multiplication is: "+mul);
		
		float div = a / b;
		System.out.println("Division is: "+div);
	}

}
