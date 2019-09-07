
public class bike extends vehicle {
	private boolean fourStroke = true;

	public bike(String name, String color, String model, String company, String engine, boolean powerSteering) {
		super(name, color, model, company, engine);
		this.fourStroke = fourStroke;

	}

	public void setFourStroke(boolean powerSteering) {
		this.fourStroke = fourStroke;
	}

	public boolean getFourStroke() {
		return this.fourStroke;
	}

	public String getInfo() {
		return "this is a bike";
	}
}