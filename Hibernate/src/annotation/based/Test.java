package annotation.based;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.Metadata;
import annotation.based.StudentAnnotation;

public class Test 
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Main Starts");
		
		// load cfg file
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		// read and validate metadata
		MetadataSources mds = new MetadataSources(registry);
		
		// store the metadata
		Metadata md = mds.getMetadataBuilder().build();
		
		// initialize hibernate (create table)
		SessionFactory sf = md.getSessionFactoryBuilder().build();
		
		// produce multiple sessions(operations like insert, update and delete)
		Session session = sf.openSession();
		
		// set values to be inserted
		StudentAnnotation stu = new StudentAnnotation();
		stu.setRollno(1);
		stu.setName("abc");
		
		// save the object 
		session.save(stu);
		
		// insert the data in database
		session.beginTransaction().commit();
		
		System.out.println("Main Ends");
	}

}
