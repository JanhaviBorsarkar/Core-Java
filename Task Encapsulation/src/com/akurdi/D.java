package com.akurdi;
import com.karve.*;

public class D extends A
{
	A a = new A();
	public void m3()
	{
		//System.out.println(a.x);
		System.out.println(a.y);
		//System.out.println(a.z);
		System.out.println(p);
	}
	public static void main(String[] args) 
	{
		C c = new C();
		D d = new D();
		c.m2();
		c.m();
		d.m();
		d.m3();
	}
}
