import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LoadBeanUsingAnnotation {

	public static void main(String[] args) {
	        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
	        HelloWorld hello = (HelloWorld) context.getBean("helloWorldBean");
	        hello.sayHello("Spring 4");
	    }
}