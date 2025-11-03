package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.model.Employee;
import com.util.HibernateUtil;

public class Application {

	public static void main(String[] args) {

		updateData();
	}

	public static void insertData() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Employee emp = new Employee(105, "alwa@gmail.com", 29000);
		session.beginTransaction();

		session.persist(emp);

		session.getTransaction().commit();

		System.out.println("Inserted....");
	}

	public static void getData() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Employee employee = session.find(Employee.class, 101);
		System.out.println(employee);
	}

	public static void updateData() {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();
		
		Employee emp = session.find(Employee.class, 102);
		emp.setSalary(35000);
		
		session.beginTransaction();
		session.merge(emp);
		session.getTransaction().commit();

	}
	
	public static void deleteData() {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();
		
		Employee emp = new Employee(101,"",0);
		
		session.beginTransaction();
		session.remove(emp);
		session.getTransaction().commit();
		
	}

}
