package constructor;

public class Instrument {

	private Guiter guiter;
	public Instrument(Guiter guiter) {
		super();
		this.guiter = guiter;
	}

	public void show() {
		guiter.playguiter();
	}
}
