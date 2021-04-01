package com.defaultInheritance;

import org.hibernate.Session;

public class Test 
{
	public static void main(String[] args) 
	{
		Session s = HUtilDefault.getSessionFactory().openSession();
		
		KarveNagar kn = new KarveNagar();
		kn.setId(1);
		kn.setKid(101);
		kn.setSname("ABC");
		kn.setCname("Java");
		kn.setRegularbatch("130");
		
		Akurdi ak = new Akurdi();
		ak.setId(2);
		ak.setAid(201);
		ak.setSname("XYZ");
		ak.setCname("Python");
		ak.setWeekendbatch("128");
		
		s.save(kn);
		s.save(ak);
		
		s.beginTransaction().commit();
		
	}
}
