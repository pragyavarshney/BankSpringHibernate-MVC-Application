package com.apex.bank.dao;

import java.util.List;

import com.apex.bank.vo.Contact;

public interface ContactDAO {
	
	void addPersonContact(Contact contact) throws Exception;

	void updatePersonContact(Contact contact) throws Exception;

	void deletePersonContact(int id) throws Exception;

	Contact getPersonContact(int id) throws Exception;
	
	public List<Contact> getCinfoTableList() throws Exception;



}
