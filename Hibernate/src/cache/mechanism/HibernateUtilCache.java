package cache.mechanism;

import java.util.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.Metadata;

public class HibernateUtilCache 
{
	private static StandardServiceRegistry registry = null;
	private static SessionFactory sf = null;
	
	public static SessionFactory getSessionFactory()
	{
		if(sf == null)
		{
			Map<String, Object> settings = new HashMap<>();
			
			settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
			settings.put(Environment.URL, "jdbc:mysql://localhost:3306/cache");
			settings.put(Environment.USER, "root");
			settings.put(Environment.PASS, "root");
			settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
			settings.put(Environment.HBM2DDL_AUTO, "update");
			settings.put(Environment.SHOW_SQL, "true");
			settings.put(Environment.USE_SECOND_LEVEL_CACHE, "true");
			settings.put(Environment.CACHE_REGION_FACTORY, "org.hibernate.cache.ehcache.EhCacheRegionFactory");
			
			registry = new StandardServiceRegistryBuilder().applySettings(settings).build();
			MetadataSources mds = new MetadataSources(registry);
			mds.addAnnotatedClass(StudentCache.class);
			Metadata md = mds.getMetadataBuilder().build();
			sf = md.getSessionFactoryBuilder().build();
		}
		return sf;
	}
}
