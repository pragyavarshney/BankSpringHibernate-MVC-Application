package com.apex.bank.bo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.apex.bank.vo.Bank;
import com.apex.bank.vo.Contact;
import com.apex.bank.vo.Person;

public interface BankBo {

	void addPerson(Person person) throws Exception;

	void addContact(Contact contact) throws Exception;

	void addBankInfo(Bank bank) throws Exception;

	Person getPerson(int Id) throws SQLException, NumberFormatException, Exception;

	Contact getContact(int Id) throws SQLException, NumberFormatException, Exception;

	Bank getBankInfo(int Id) throws SQLException, NumberFormatException, Exception;

	void deletePerson(int Id) throws Exception;

	void deleteContact(int Id) throws Exception;

	void deleteBankInfo(int Id) throws Exception;

	List<Person> getPinfoTableList() throws Exception;

	List<Contact> getCinfoTableList() throws Exception;

	List<Bank> getBinfoTableList() throws Exception;

	boolean doesIdExist(int id) throws SQLException, NumberFormatException, Exception;

}
