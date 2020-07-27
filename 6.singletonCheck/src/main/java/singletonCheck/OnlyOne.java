package singletonCheck;

public class OnlyOne {

	private static OnlyOne onlyOne;
	
	private OnlyOne() {	}
	
	private static OnlyOne getInstances() {
		if(onlyOne == null) {
			onlyOne = new OnlyOne();
		}
		return onlyOne;
	}
	
}
