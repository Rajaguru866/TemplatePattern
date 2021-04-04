package templatePattern;

public class Cricket extends Game{

	@Override
	public void toss() {
		
		System.out.println("Toss Completed");
		
	}

	@Override
	public void start() {
		
		System.out.println("Cricket was started");
		
	}

	@Override
	public void end() {
		
		System.out.println("The game comes to an end");
		
	}

}
