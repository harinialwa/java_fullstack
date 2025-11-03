package com.embeddale;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Car;
import com.model.CarId;
import com.util.HibernateUtil;

public class Application {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		//insert(session);
		
		session.find(Car.class, new CarId(1,"23rc4566"));
	}

	private static void insert(Session session) {
		session.beginTransaction();
		Car car = new Car(new CarId(1,"23rc4566"),"maruti suzuki",100000);
		session.persist(car);
		
		session.getTransaction().commit();
	}

}
