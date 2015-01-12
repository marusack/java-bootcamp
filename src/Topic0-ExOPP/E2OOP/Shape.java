import java.util.Formatter;

public class Shape {

	private String color = "red";
	private boolean filled = true;

	public Shape() {
	}

	public Shape(String color, boolean filled) {
		this.setColor(color);
		this.setFilled(filled);
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean getFilled() {
		return this.filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Formatter formatter = new Formatter(sb);
		formatter.format("A Shape with color of %s and %s", color, (filled ? "filled" : "not filled"));
		return sb.toString();
	}
}