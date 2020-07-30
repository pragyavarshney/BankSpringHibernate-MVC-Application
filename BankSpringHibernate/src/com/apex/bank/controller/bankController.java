package com.apex.bank.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.apex.bank.bo.*;
import com.apex.bank.vo.*;


@Controller
@SessionAttributes("bankDetais")
public class bankController {
	
	@Autowired
	BankBo bankBo;
	
	@ModelAttribute("bankDetails")
	public Bank getBank() {
		return new Bank();
	}
	
	@RequestMapping("/bankEntry.do")
	public String entryAddUser(@ModelAttribute Bank bankDetails) {
		return "bankInfo";
	}
	
	@RequestMapping("/processUserBank.do")
	public String processUserBank(@ModelAttribute("bankDetails") Bank bankDetails) {
		
		System.out.println("userController: processUserBank():start()");
		//Step 1: get the value OBJ
		System.out.println("User Bank name: " + bankDetails.getBankName());
		
		//Step2: call the BO 
		try {
			bankBo.addBankInfo(bankDetails);
		} catch (Exception e) {
			e.printStackTrace();
		}		
		//Step3: return the view
		System.out.println("userController: processUserBank():end()");
		return "success";
	}
}
