package org.sang.controller.per;


import java.util.ArrayList;

import org.sang.bean.Employeeec;
import org.sang.bean.RespBean;
import org.sang.bean.Salary;
import org.sang.service.EmpService;
import org.sang.service.EmployeeecService;
import org.sang.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/personal/pop")
public class PersonalController {
	@Autowired
	EmployeeecService employeeecService;
	
	
	 @RequestMapping(value = "/employeeec", method = RequestMethod.GET)
	    public List<Employeeec> getAllEmployeeec() {
		
	      List<Employeeec> list= employeeecService.getAllEmployeeec();
	    
	       return list;
	        
	    }
   
}
