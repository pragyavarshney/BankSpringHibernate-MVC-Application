package com.apex.bank.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.apex.bank.bo.BankBo;

@Controller
public class deleteController {
	
	@Autowired
	BankBo userBo;
	
	@RequestMapping("/deleteEntry.do")
	public String entryAddUser() {
		
		return "deletePerson";
	}
	@RequestMapping("/processDeleteUser.do")
	public String processDeleteUser(@RequestParam("personId") int Id, Model model) throws NumberFormatException, Exception {
		
		System.out.println("userController: processDeleteUser():start()");
		//Step 1: get the value OBJ
		String newMsg = "";
		System.out.println("The Id: " + Id);
		//Step2: call the BO 
		boolean doesExist = userBo.doesIdExist(Id);
		
		if(doesExist)
		{
			try {
				
				userBo.deletePerson(Id);
				userBo.deleteContact(Id);
				userBo.deleteBankInfo(Id);
				
				newMsg += "The id was deleated";
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}else {
	
			newMsg += "The id does not exist.";
			System.out.println("The id does not exist");
		}
		System.out.println("The value :"+ doesExist);
		//Step3: return the view
		model.addAttribute("message",newMsg);
		System.out.println("userController: processDeleteUser():end()");
		return "deletePersonOutput";
	}

}
