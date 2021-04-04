package templatePattern;

public class TemplatePatternMain {

	public static void main(String[] args) {
		
		Game game1 = new Cricket();
		game1.play();
		
		Game game2 = new Kabbadi();
		game2.play();
		
	}
}
