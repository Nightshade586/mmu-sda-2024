import java.util.ArrayList;

public class BlurayCollection {
	
	private ArrayList<String> lib = new ArrayList<String>();

	public BlurayCollection() {
		// here is my movie library on Bluray, implemented as collection of Strings
		lib.add("Mad Max 1");
		lib.add("Mad Max 2");
		lib.add("Brazil");
		lib.add("Men in Black");
	}

	public String select(String s) {
		String movie;
		// find s in the collection, else return first item
		if (lib.contains(s)) {
			movie = s;
		} else {
			movie = lib.get(0);
		}
		return movie;
	}

}
