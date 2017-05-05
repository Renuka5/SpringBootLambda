package com.example;

import java.util.Map;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaFunctionHandler implements RequestHandler<String, String>{

    
	//@Autowired
    private final StudentController studentController=new StudentController();
	
	@Autowired
    public LambdaFunctionHandler() {
		System.out.println("Constructor of lambda function handler....student controller is getting initialised");
       //this.studentController = Objects.requireNonNull(studentController);
    }
    
    @Override
    public String handleRequest(String input, Context context) {
    	System.out.println("Invoking lambda function handler....");
    	context.getLogger().log("Inside lambda:");
    	// studentController = getApplicationContext().getBean(StudentController.class);
        String result = null;
        try {
        	context.getLogger().log("Before:");
            result = studentController.printHello();
            context.getLogger().log("After:");
        } catch (Exception e) {
        	e.printStackTrace();
        }
        return result;
    }
}
