
public class Car extends vehicle {
	private boolean powerSteering = false;
	private boolean ledScreen = true;

	public Car(String name, String color, String model, String company, String engine, boolean powerSteering,
			boolean ledScreen) {
		// send these properties to the parent class
		super(name, color, model, company, engine);
		this.powerSteering = powerSteering;
		this.ledScreen = ledScreen;
	}

	public String getName() {
		return "the model of your vehicle is: " + super.getName();
	}

	public void setPowerStreering(boolean powerSteering) {
		this.powerSteering = powerSteering;
	}

	public void setLedScreen(boolean ledScreen) {
		this.ledScreen = ledScreen;
	}

	public boolean getPowerSteering() {
		return this.powerSteering;
	}

	public boolean getLedScreen() {
		return this.ledScreen;
	}

	public String getInfo() {
		return "this is a car";
	}
}