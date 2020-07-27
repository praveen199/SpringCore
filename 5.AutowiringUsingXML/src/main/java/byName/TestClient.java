package byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {

	public static void main(String[] args) {
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("byNameAutowire.xml");
		Instrument itr =(Instrument) ctx.getBean("id1");
		itr.show();
	}

}
