package com.apex.bank.bo;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.apex.bank.dao.*;
import com.apex.bank.vo.Bank;
import com.apex.bank.vo.Contact;
import com.apex.bank.vo.Person;

@Service
@Component
public class BankImp implements BankBo {

	@Autowired
	PersonDAO personDAO;
	@Autowired
	ContactDAO contactDAO;
	@Autowired
	BankDAO bankDAO;

	@Override
	public void addPerson(Person person) throws Exception {
		System.out.println("addPerson method start()");
		personDAO.addPerson(person);
		System.out.println("addPerson method end()");

	}

	@Override
	public void addContact(Contact contact) throws Exception {
		System.out.println("addContact method start()");
		contactDAO.addPersonContact(contact);
		System.out.println("addContact method end()");

	}

	@Override
	public void addBankInfo(Bank bank) throws Exception {
		System.out.println("addBank method start()");
		bankDAO.addPersonBank(bank);
		System.out.println("addBank method end()");

	}

	@Override
	public Person getPerson(int Id) throws SQLException, NumberFormatException, Exception {

		System.out.println("getPerson method start()");
		Person person = new Person();
		person = personDAO.getPerson(Id);
		System.out.println("getPerson method end()");
		return person;
	}

	@Override
	public Contact getContact(int Id) throws SQLException, NumberFormatException, Exception {

		System.out.println("getContact method start()");
		Contact contact = new Contact();
		contact = contactDAO.getPersonContact(Id);
		System.out.println("getContact method end()");
		return contact;
	}

	@Override
	public Bank getBankInfo(int Id) throws SQLException, NumberFormatException, Exception {

		System.out.println("getBank method start()");
		Bank bank = new Bank();
		bank = bankDAO.getPersonBank(Id);
		System.out.println("getBank method end()");
		return bank;
	}

	@Override
	public void deletePerson(int Id) throws Exception {
		System.out.println("deletePerson method start()");
		personDAO.deletePerson(Id);
		System.out.println("deletePerson method end()");

	}

	@Override
	public void deleteContact(int Id) throws Exception {
		System.out.println("deleteContact method start()");
		contactDAO.deletePersonContact(Id);
		System.out.println("deleteContact method end()");

	}

	@Override
	public void deleteBankInfo(int Id) throws Exception {
		System.out.println("deleteBank method start()");
		bankDAO.deletePersonBank(Id);
		System.out.println("deleteBank method end()");

	}

	@Override
	public List<Person> getPinfoTableList() throws Exception {

		System.out.println("getPinfoTableList method start()");
		List<Person> plist = personDAO.getPinfoTableList();
		System.out.println("getPinfoTableList method end()");
		return plist;
	}

	@Override
	public List<Contact> getCinfoTableList() throws Exception {

		System.out.println("getCinfoTableList method start()");
		List<Contact> clist = contactDAO.getCinfoTableList();
		System.out.println("getCinfoTableList method end()");
		return clist;
	}

	@Override
	public List<Bank> getBinfoTableList() throws Exception {

		System.out.println("getBinfoTableList method start()");
		List<Bank> blist = bankDAO.getBinfoTableList();
		System.out.println("getBinfoTableList method end()");
		return blist;
	}

	@Override
	public boolean doesIdExist(int id) throws SQLException, NumberFormatException, Exception {

		System.out.println("doesIdExist method start()");
		boolean ret = personDAO.getId(id);
		return ret;
	}

}
