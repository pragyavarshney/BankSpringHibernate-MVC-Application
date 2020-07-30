package com.apex.bank.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.apex.bank.util.HibernateUtil;
import com.apex.bank.vo.Contact;

@Repository
public class ContactDAOImpl implements ContactDAO {

	Session ses = null;

	@Override
	public void addPersonContact(Contact contact) throws Exception {

		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			session.save(contact);
			tx.commit();
			session.close();

		} catch (HibernateException ex) {
			throw new Exception(ex);
		}

	}

	@Override
	public void updatePersonContact(Contact contact) throws Exception {
		try {

			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			session.update(contact);
			tx.commit();
			session.close();

		} catch (HibernateException ex) {
			throw new Exception(ex);
		}

	}

	@Override
	public void deletePersonContact(int id) throws Exception {

		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Contact contact = (Contact) session.load(Contact.class, new Integer(id));
			Transaction tx = session.beginTransaction();
			session.delete(contact);
			tx.commit();
			session.close();
		} catch (HibernateException ex) {
			throw new Exception(ex);
		}

	}

	@Override
	public Contact getPersonContact(int id) throws Exception {
		Contact cont = null;
		try {
			ses = HibernateUtil.getSessionFactory().openSession();
			cont = (Contact) ses.load(Contact.class, new Integer(id));
			// session.close();
		} catch (HibernateException ex) {
			throw new Exception(ex);
		}
		return cont;

	}

	@Override
	public List<Contact> getCinfoTableList() throws Exception {

		List<Contact> fetchedData;
		Session session = HibernateUtil.getSessionFactory().openSession();
		fetchedData = session.createCriteria(Contact.class).list();
		session.close();
		return fetchedData;
	}

}
