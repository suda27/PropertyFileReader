package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static final String APPLICATION_CONTEXT_XML = "ApplicationContext.xml";

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(APPLICATION_CONTEXT_XML);
		String employee = context.getMessage("employee.name", new Object[] { 23, "Programmer Analyst" }, null);
		System.out.println(employee);
	}

}
