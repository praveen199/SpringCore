package singletonCheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("singletonCheck.xml");
		OnlyOne oo1 =(OnlyOne) ctx.getBean("id1");
		OnlyOne oo2 =(OnlyOne) ctx.getBean("id1");
		System.out.println("oo1 hashcode : "+ oo1.hashCode());
		System.out.println("oo2 hashcode : "+ oo2.hashCode());
	}
}
