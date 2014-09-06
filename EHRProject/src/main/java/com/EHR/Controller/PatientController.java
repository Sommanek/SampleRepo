package com.EHR.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/Patient")
@Controller
public class PatientController {

	@RequestMapping("/addPatient")
	public String addPatient(ModelMap map){
		
		return "AddPatient";
	}
}
