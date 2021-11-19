package spring.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
    	
		@SuppressWarnings("resource")
		ApplicationContext context=new  ClassPathXmlApplicationContext("config.xml");
        Customer customer = (Customer) context.getBean("customer1");
        System.out.println(customer);
    }
}