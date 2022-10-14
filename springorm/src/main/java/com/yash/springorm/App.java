package com.yash.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.springorm.dao.StudentDao;
import com.yash.springorm.entities.Student;

/**
 * 
 *
 */
//we ned to create a schema in db
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        StudentDao studao=context.getBean("studentDao",StudentDao.class);
        Student stu=new Student(21,"Nilesh");
        stu.setId(2);
        stu.setName("Vijay");
        int msg=studao.insert(stu);
        System.out.println(msg + "insertion done");
    }
}
