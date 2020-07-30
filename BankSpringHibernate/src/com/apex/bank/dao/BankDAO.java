package com.apex.bank.dao;

import java.util.List;

import com.apex.bank.vo.Bank;

public interface BankDAO {
	
	Bank getPersonBank(int id) throws Exception;

	void deletePersonBank(int id) throws Exception;

	void updatePersonBank(Bank bank) throws Exception;

	void addPersonBank(Bank bank) throws Exception;
	
	public List<Bank> getBinfoTableList() throws Exception;



}
