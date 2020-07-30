package com.apex.bank.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.apex.bank.util.HibernateUtil;
import com.apex.bank.vo.Person;

@Repository
public class PersonDAOImpl implements PersonDAO {

	Session ses = null;

	@Override
	public void addPerson(Person person) throws Exception {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			session.save(person);
			tx.commit();
			session.close();

		} catch (HibernateException ex) {
			throw new Exception(ex);
		}

	}

	@Override
	public void updatePerson(Person person) throws Exception {

		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			session.update(person);
			tx.commit();
			session.close();
			// HibernateUtil.getSession().save(dept);

		} catch (HibernateException ex) {
			throw new Exception(ex);
		}

	}

	@Override
	public void deletePerson(int id) throws Exception {

		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Person person = (Person) session.load(Person.class, new Integer(id));
			Transaction tx = session.beginTransaction();
			session.delete(person);
			tx.commit();
			session.close();
		} catch (HibernateException ex) {
			throw new Exception(ex);
		}
	}

	@Override
	public Person getPerson(int id) throws Exception {

		Person person = null;
		try {
			ses = HibernateUtil.getSessionFactory().openSession();
			person = (Person) ses.load(Person.class, new Integer(id));
		} catch (HibernateException ex) {
			throw new Exception(ex);
		}
		// session.close();
		return person;
	}

	@Override
	public List<Person> getPinfoTableList() throws Exception {

		List<Person> fetchedData;
		Session session = HibernateUtil.getSessionFactory().openSession();
		fetchedData = session.createCriteria(Person.class).list();
		session.close();
		return fetchedData;
	}

	@Override
	public boolean getId(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Person person = (Person) session.get(Person.class, id);

		if (person == null) {
			return false;
		}
		return true;

	}

}
