package com.apex.bank.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.apex.bank.util.HibernateUtil;
import com.apex.bank.vo.Bank;

@Repository
public class BankDAOImpl implements BankDAO {

	Session ses = null;

	@Override
	public Bank getPersonBank(int id) throws Exception {

		Bank bank = null;
		try {
			ses = HibernateUtil.getSessionFactory().openSession();
			bank = (Bank) ses.load(Bank.class, new Integer(id));
		} catch (HibernateException ex) {
			throw new Exception(ex);
		}
		// session.close();
		return bank;

	}

	@Override
	public void deletePersonBank(int id) throws Exception {

		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Bank bank = (Bank) session.load(Bank.class, new Integer(id));
			Transaction tx = session.beginTransaction();
			session.delete(bank);
			tx.commit();
			session.close();
		} catch (HibernateException ex) {
			throw new Exception(ex);
		}

	}

	@Override
	public void updatePersonBank(Bank bank) throws Exception {

		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			session.update(bank);
			tx.commit();
			session.close();

		} catch (HibernateException ex) {
			throw new Exception(ex);
		}
	}

	@Override
	public void addPersonBank(Bank bank) throws Exception {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			session.save(bank);
			tx.commit();
			session.close();

		} catch (HibernateException ex) {
			throw new Exception(ex);
		}
	}

	@Override
	public List<Bank> getBinfoTableList() throws Exception {

		List<Bank> fetchedData;
		Session session = HibernateUtil.getSessionFactory().openSession();
		fetchedData = session.createCriteria(Bank.class).list();
		session.close();
		return fetchedData;
	}

}
