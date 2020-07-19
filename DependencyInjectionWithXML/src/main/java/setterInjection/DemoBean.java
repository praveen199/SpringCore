package setterInjection;

public class DemoBean {

	private int id;
	private String msg;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public void print(){
		System.out.println("Id : " + id + " & " +"msg : " + msg);
	}
}
