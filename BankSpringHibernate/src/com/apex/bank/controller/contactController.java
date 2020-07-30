package com.apex.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.apex.bank.bo.BankBo;
import com.apex.bank.vo.Contact;


@Controller
@SessionAttributes("contact")
public class contactController {
	
	@Autowired
	BankBo bankBo;
	
	@ModelAttribute("contact")
	public Contact getContact() {
		return new Contact();
	}
	
	@RequestMapping("/contactEntry.do")
	public String entryAddUser(@ModelAttribute Contact contact) {

		return "contactInfo";
	}
	
	@RequestMapping("/processUserContact.do")
	public String processUserContact(@ModelAttribute("contact") Contact contact) {

		System.out.println("userController: processUserContact():start()");
		// Step 1: get the value OBJ
		System.out.println("User Address name: " + contact.getAddress());

		// Step2: call the BO
		try {
			bankBo.addContact(contact);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Step3: return the view
		System.out.println("userController: processUserContact():end()");
		return "redirect:/bankEntry.do";
	}

}
