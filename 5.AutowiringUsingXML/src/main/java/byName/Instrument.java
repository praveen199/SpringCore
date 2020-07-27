package byName;

public class Instrument {

	private Guiter guiter;
	public Guiter getGuiter() {
		return guiter;
	}
	public void setGuiter(Guiter guiter) {
		this.guiter = guiter;
	}
	
	public void show() {
		guiter.playguiter();
	}
}
