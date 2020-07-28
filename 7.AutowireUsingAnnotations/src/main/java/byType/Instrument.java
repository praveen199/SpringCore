package byType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Instrument {

	private Guiter guiter;
	public Guiter getGuiter() {
		return guiter;
	}
	@Autowired
	public void setGuiter(Guiter guiter) {
		this.guiter = guiter;
	}
	
	public void show() {
		guiter.playguiter();
	}
	
}
