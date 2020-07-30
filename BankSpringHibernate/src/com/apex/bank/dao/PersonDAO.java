package com.apex.bank.dao;

import java.util.List;

import com.apex.bank.vo.Person;

public interface PersonDAO {
	
	public void addPerson(Person person) throws Exception;
	public void updatePerson(Person person) throws Exception;
	public void deletePerson(int id) throws Exception;
	public Person getPerson(int id) throws Exception;
	public List<Person> getPinfoTableList() throws Exception;
	public boolean getId(int id);

}
