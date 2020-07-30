package com.apex.bank.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.apex.bank.bo.BankBo;
import com.apex.bank.vo.Person;

@Controller
@SessionAttributes("person")
public class personController {

	@Autowired
	BankBo bankBo;

	@ModelAttribute("person")
	public Person getPerson() {
		return new Person();
	}

	@RequestMapping("/userEntry.do")
	public String entryAddUser(@ModelAttribute Person person) {

		return "personInfo";
	}

	@RequestMapping("/processUserPerson.do")
	public String processUserPerson(@ModelAttribute("person") Person person) {

		System.out.println("userController: processUserPerson():start()");
		// Step 1: get the value OBJ
		System.out.println("First Name: " + person.getFirstName());

		// Step2: call the BO
		try {
			bankBo.addPerson(person);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Step3: return the view
		System.out.println("userController: processUserPerson():end()");
		return "redirect:/contactEntry.do";
	}

}
