package com;

import org.hibernate.SessionFactory;
import org.hibernate.Session;

import com.model.Student;
import com.util.HibernateUtil;

public class Application {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Student student = new Student("alwa",75);
		
		session.beginTransaction();
		session.persist(student);
		
		session.getTransaction().commit();
		session.close();
	}
}
