
import drawing.Line;
import drawing.CartesianLine;

public class Client {

	public static void main(String[] args) {

		Client client = new Client();

		int x1 = 10, y1 = 100; // top left
		int x2 = 100, y2 = 100; // top right
		int x3 = 100, y3 = 10; // lower right
		int x4 = 10, y4 = 10; // lower left

		Line upperLine = new CartesianLine(x1, y1, x2, y2);
		Line rightLine = new CartesianLine(x2, y2, x3, y3);
		Line lowerLine = new CartesianLine(x3, y3, x4, y4);
		Line leftLine = new CartesianLine(x4, y4, x1, y1);

		client.draw(upperLine, rightLine, lowerLine, leftLine);
	}

	void draw(Line upperLine, Line rightLine, Line lowerLine, Line leftLine) {
		// Draw a rectangle by drawing four lines
		upperLine.draw();
		rightLine.draw();
		lowerLine.draw();
		leftLine.draw();

	}

}
