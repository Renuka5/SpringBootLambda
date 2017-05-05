package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class StudentController {
	
	@Autowired
	StudentService studentService;

	@RequestMapping(value = "/msg", method = RequestMethod.GET)
	public String printHello() {
		return studentService.getHelloMsg();
	   }

}


   
