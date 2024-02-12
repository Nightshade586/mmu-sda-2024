public class HomeMovie {
	
	public static void main(String[] args) {
		/*
		 * we wish to make coffee, select movie on BluRay, turn on amplifier, display
		 * screen and then watch the movie
		 */

		// set up each item
		CoffeeMaker cm = new CoffeeMaker();
		BlurayCollection movies = new BlurayCollection();
		Amplifier amp = new Amplifier();
		Screen screen = new Screen();
		Projector proj = new Projector();
		Player player = new Player();

		// call each item in turn
		cm.on(); // turn on coffee maker
		cm.makeCoffee("black"); // make a specific coffee
		cm.off(); // turn off coffee maker to save energy

		// select a movie from Bluray collection
		// returning nearest match
		String m = movies.select("Men in Black");

		amp.on(); // turn on amplifier
		amp.changeVolume(11); // Change the volume by 11
		screen.lower(); // lower the screen
		proj.on(); // turn on projector
		player.on();
		player.setFormat("Bluray");
		player.play(m);

		// when movie finishes we need to turn everything off in the reverse order
		player.eject();
		player.off();
		proj.off();
		screen.raise();
		amp.off();

		System.out.println("goodnight!");

	}
}
