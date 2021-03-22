package annotation.based;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import annotation.based.StudentAnnotation;

import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.Metadata;

public class GetData 
{
	public static void main(String[] args) 
	{
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		MetadataSources mds = new MetadataSources(registry);
		
		Metadata md = mds.getMetadataBuilder().build();
		
		SessionFactory sf = md.getSessionFactoryBuilder().build();
		
		Session session = sf.openSession();
		
		StudentAnnotation stu = session.load(StudentAnnotation.class, 1);
		
		System.out.println("Rollno: " +stu.getRollno());
		System.out.println("Name: " +stu.getName());
	}
}
