package com.example;

import com.amazonaws.services.lambda.runtime.Context;
import me.ccampo.spring.aws.lambda.SpringRequestHandler;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainHandler extends SpringRequestHandler<String, String> {

    private static final ApplicationContext context =
            new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

    @Override
    public ApplicationContext getApplicationContext() {
    	System.out.println("Inside main handler: before returning context");
        return context;
    }
    
}
