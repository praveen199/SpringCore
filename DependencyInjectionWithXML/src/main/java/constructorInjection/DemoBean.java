package constructorInjection;

public class DemoBean {

	/*
	private int id;
	private String msg;

	public DemoBean(int id, String msg) {
		super();
		this.id = id;
		this.msg = msg;
	}
	public void print(){
		System.out.println("Id : " + id + " & " +"msg : " + msg);
	}*/

	private Class1 class1;
	private Class2 class2;

	public DemoBean(Class1 class1, Class2 class2) {
		super();
		this.class1 = class1;
		this.class2 = class2;
	}

	public void print(){
		class1.printId();
		class2.printMsg();
	}
}
