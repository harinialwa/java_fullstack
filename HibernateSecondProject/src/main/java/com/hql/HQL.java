package com.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.SelectionQuery;

import com.model.Student;
import com.util.HibernateUtil;

public class HQL {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		// select(session);
		// insert(session);
		//update(session);
		//delete(session);
	}

	private static void delete(Session session) {
		session.beginTransaction();
		MutationQuery query = session.createMutationQuery("Delete from Student where studentId=?1");
		query.setParameter(1,4);
		
		query.executeUpdate();
		session.getTransaction().commit();
	}

	private static void update(Session session) {
		session.beginTransaction();
		MutationQuery query = session.createMutationQuery("Update Student set marks=?1 where studentId=?2");
		query.setParameter(1, 65);
		query.setParameter(2, 1);
		
		query.executeUpdate();
		session.getTransaction().commit();
	}

	private static void insert(Session session) {
		session.beginTransaction();
		MutationQuery query = session.createMutationQuery("insert into Student(studentId,name,marks) values(?1,?2,?3)");
		query.setParameter(1, 4);
		query.setParameter(2, "john");
		query.setParameter(3, 80);

		query.executeUpdate();
		session.getTransaction().commit();
	}

	private static void select(Session session) {
		SelectionQuery<Student> query = session.createSelectionQuery("Select s from Student s", Student.class);
		List<Student> list = query.list();
		System.out.println(list);
	}

}
