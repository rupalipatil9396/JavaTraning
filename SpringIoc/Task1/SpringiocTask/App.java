package com.yash.Task1.SpringiocTask;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/yash/Task1/SpringiocTask/applicationcontext1.xml");
    	Employee e=(Employee) context.getBean("emp1");
    	System.out.println(e);
    }
}
