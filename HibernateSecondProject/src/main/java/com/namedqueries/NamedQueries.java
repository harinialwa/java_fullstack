package com.namedqueries;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.model.Student;
import com.util.HibernateUtil;

public class NamedQueries {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		
		//select(session);
		
		session.beginTransaction();
		MutationQuery query = session.createNamedMutationQuery("update");
		query.setParameter(1, 90);
		query.setParameter(2,5);
		query.executeUpdate();
		session.getTransaction().commit();
		
	}

	private static void select(Session session) {
		Query<Student> query= session.createNamedQuery("allstudents", Student.class);
		List<Student> list = query.list();
		System.out.println(list);
	}

}
