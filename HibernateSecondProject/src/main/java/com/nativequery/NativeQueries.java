package com.nativequery;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.NativeQuery;

import com.model.Student;
import com.util.HibernateUtil;

public class NativeQueries {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		//select(session);
		session.beginTransaction();
		MutationQuery nquery = session.createNativeMutationQuery("Insert into student(studentId,name,marks) values(?1,?2,?3)");
		nquery.setParameter(1,5);
		nquery.setParameter(2, "roshan");
		nquery.setParameter(3, 90);
		nquery.executeUpdate();
		session.getTransaction().commit();

	}

	private static void select(Session session) {
		NativeQuery<Student> nquery = session.createNativeQuery("Select * from student", Student.class);
		List<Student> list = nquery.list();
		System.out.println(list);
	}

}
