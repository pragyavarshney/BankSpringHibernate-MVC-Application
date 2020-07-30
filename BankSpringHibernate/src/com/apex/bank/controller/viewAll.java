package com.apex.bank.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.apex.bank.bo.BankBo;
import com.apex.bank.vo.Bank;
import com.apex.bank.vo.Contact;
import com.apex.bank.vo.Person;

@Controller
public class viewAll{
	
	@Autowired
	BankBo userBo;
	

	@RequestMapping("/processViewAll.do")
	public String processViewAll(Model model) throws SQLException {
		
		System.out.println("userController: processViewAll():start()");
		//Step 1: get the value OBJ
		List<Person> pinfo = new ArrayList();
		List<Contact> cinfo = new ArrayList();
		List<Bank> binfo = new ArrayList();

		// Step2: call the BO
		
		try {
			
			pinfo = userBo.getPinfoTableList();
			cinfo = userBo.getCinfoTableList();
			binfo = userBo.getBinfoTableList();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		//Step3: return the view
		model.addAttribute("pinfo",pinfo);
		model.addAttribute("cinfo",cinfo);
		model.addAttribute("binfo",binfo);
		System.out.println("userController: processViewAll():end()");
		return "viewall";
	}
}