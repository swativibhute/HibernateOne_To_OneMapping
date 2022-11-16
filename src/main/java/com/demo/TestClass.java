package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestClass {

	public static void main(String[] args) {


		Configuration  configuration =new Configuration();
		configuration.configure("Hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		
		Address address = new Address();
		address.setCity("danoli");
		address.setTaluka("Shirol");
		address.setDistrict("Kolhapur");
		address.setPincode(412101);
		
		Student student = new Student();
		student.setFirstName("Sushant");
		student.setLastName("sagare");
		student.setMobile(4523698745l);
		student.setAddress(address);
		
		
		session.save(student);
		session.getTransaction().commit();
		session.close();
		System.out.println("done");
	}

}
