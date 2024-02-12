public class Player {
	
	public void on() {
		System.out.println("Multifunctional Player ON");
	}

	public void off() {
		System.out.println("Multifunctional Player OFF");
	}

	public void eject() {
		System.out.println("Multifunctional Player ejecting disk");
	}

	public void setFormat(String s) {
		System.out.println("Player ready to read format " + s);
	}

	public void play(String s) {
		System.out.println("Playing movie " + s);
	}

}
