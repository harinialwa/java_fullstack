package com.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Employee;
import com.util.HibernateUtil;

public class States {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Employee emp = new Employee(102,"john@gmail.com",35000); // Transient
		Employee emp2 = new Employee(103,"sita@gmail.com",25000);
		emp2.setSalary(10000);
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		session.persist(emp); // Persistent
		
		emp.setSalary(30000);
		
		session.getTransaction().commit();
		
		session.close();
		
		emp.setSalary(24000); // Detached
		
		
	}

}

