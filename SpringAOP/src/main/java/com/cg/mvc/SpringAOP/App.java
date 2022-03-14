package com.cg.mvc.SpringAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.mvc.SpringAOP.services.PaymentService;

public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	
    	PaymentService paymentObject = context.getBean("payment", PaymentService.class);
    	
    	//Authorize, print:payment started
    	paymentObject.makePayment(67588);
    	
    }
}
