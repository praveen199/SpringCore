package constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beansForConstructorInjection.xml");
		DemoBean bean=(DemoBean)ctx.getBean("id1");
		bean.print();
	}
}
	