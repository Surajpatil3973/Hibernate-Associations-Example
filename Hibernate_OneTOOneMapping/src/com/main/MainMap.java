package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Laptop;
import com.entity.Student;

public class MainMap {
	public static void main(String[] args) {
		
	Configuration cfg = new Configuration();
	cfg.addAnnotatedClass(Student.class);
	cfg.addAnnotatedClass(Laptop.class);
	cfg.configure();
	
	SessionFactory sf = cfg.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction tr = ss.beginTransaction();
	
	Laptop l=new Laptop();
	l.setL_id(1200);
	l.setL_name("lenovo");
	
	
	ss.persist(l);
	
	Student s=new Student();
	s.setStud_id(1);
	s.setS_name("suraj");
	s.setLaptop(l);
	
	ss.persist(s);
	
	System.out.println("maping sucessfully..");
	tr.commit();
	ss.close();
	
	}

}
