package templatePattern;

public abstract class Game {
	
	public abstract void toss();
	public abstract void start();
	public abstract void end();
	
	public void play()
	{
		toss();
		start();
		end();
	}
	

}
