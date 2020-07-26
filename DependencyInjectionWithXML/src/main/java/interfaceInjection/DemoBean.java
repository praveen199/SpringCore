package interfaceInjection;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class DemoBean implements ApplicationContextAware {

	ApplicationContext ctx;
	private String msg;

	public ApplicationContext getCtx() {
		return ctx;
	}
	public void setCtx(ApplicationContext ctx) {
		this.ctx = ctx;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.ctx = applicationContext;
	}
	public void print(){
		System.out.println("This is interfce injection : " + msg);
	}




}
