package com.websystique.hibernate;

import org.hibernate.Query;
import org.hibernate.Session;

import com.websystique.hibernate.model.Student;
import com.websystique.hibernate.model.Subject;
import org.hibernate.mapping.List;


public class HibernateStandAlone {
	
	public static void main(String[] args) {

//		Student student1 = new Student("Sam","Disilva");
//		Student student2 = new Student("Joshua", "Brill");
//
//		Subject subject1 = new Subject("Economics");
//		Subject subject2 = new Subject("Politics");
//		Subject subject3 = new Subject("Foreign Affairs");
//
//		//Student1 have 3 subjects
//		student1.getSubjects().add(subject1);
//		student1.getSubjects().add(subject2);
//		student1.getSubjects().add(subject3);
//
//		//Student2 have 2 subjects
//		student2.getSubjects().add(subject1);
//		student2.getSubjects().add(subject2);

		Session session = HibernateUtil.getSessionFactory().openSession();
//		session.beginTransaction();

		String hql = "FROM Subject";
		Query query = session.createQuery(hql);
		List results = (List) query.list();




//		session.persist(student1);
//		session.persist(student2);
//
//		session.getTransaction().commit();
		session.close();  
	}

}
