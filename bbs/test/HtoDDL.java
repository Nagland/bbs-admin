import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.*;
import org.hibernate.annotationfactory.*;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
public class HtoDDL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = null;
		
		AnnotationConfiguration configuration =  (AnnotationConfiguration) new AnnotationConfiguration().configure("/hibernate/hibernate.cfg.xml");
		
		sessionFactory = configuration.buildSessionFactory();
		
		sessionFactory.close();
		
	}

}
