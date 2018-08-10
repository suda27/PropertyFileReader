package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import autowire.Application;
import qualifier.Bond;

public class Main {

	public static final String APPLICATION_CONTEXT_AUTO_WIRE_XML = "ApplicationContext_AutoWire.xml";
	public static final String APPLICATION = "application";
	public static final String APPLICATION_CONTEXT_XML = "ApplicationContext.xml";
	private static final String CAR_XML = "car.xml";

	public static void main(String[] args) {
		//getEmployeeDetailsFromPropertyFile();
		//getAutowire();
		//getAutowireByAnotations();
		getCarName();
	}

	private static void getCarName() {
		ApplicationContext context = new ClassPathXmlApplicationContext(CAR_XML);
		Bond bond = (Bond)context.getBean("bond");
		System.out.println(bond.displayCarName());
	}

	private static void getAutowireByAnotations() {
		ApplicationContext context = new ClassPathXmlApplicationContext(APPLICATION_CONTEXT_AUTO_WIRE_XML);
		Application application = (Application)context.getBean(APPLICATION);
		System.out.println(application);
		
	}

	private static void getAutowire() {
		ApplicationContext context = new ClassPathXmlApplicationContext(APPLICATION_CONTEXT_XML);
		Application application = (Application)context.getBean(APPLICATION);
		System.out.println(application);
	}

	public static void getEmployeeDetailsFromPropertyFile() {
		ApplicationContext context = new ClassPathXmlApplicationContext(APPLICATION_CONTEXT_XML);
		String employee = context.getMessage("employee.name", new Object[] { 23, "Programmer Analyst" }, null);
		System.out.println(employee);
	}

}
