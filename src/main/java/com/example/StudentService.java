package com.example;

import org.springframework.stereotype.Service;

@Service
public class StudentService {


	public String getHelloMsg() {
		System.out.println("inside the controller!! ");
	      return "Hello there!! Have a nice day";
	}
}
