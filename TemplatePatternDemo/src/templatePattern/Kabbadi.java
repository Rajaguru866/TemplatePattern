package templatePattern;

public class Kabbadi extends Game{

	@Override
	public void toss() {
		
		System.out.println("Toss Completed");
		
	}

	@Override
	public void start() {
		
		System.out.println("Kabbadi was started");
		
	}

	@Override
	public void end() {
		
		System.out.println("Game comes to an end");
		
	}

}
