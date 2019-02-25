
public class vehicle {
	private String name, color,model,company;
	private String engine = "800";
	public static int count = 0;
	
	
	
	
	
	public vehicle() {
		count++;
	}
	
	public vehicle(String name,String color,String model, String company,String engine) 
	{
		this.name = name;
		this.color = color;
		this.model = model;
		this.company = company;	
		this.engine = engine;
		count++;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	
	// no parameters when you are getting something
	// need to set the return type
	public String getName() {
		return this.name;
	}
	public String getColor() {
		return this.color;
	}
	public String getModel() {
		return this.model;
	}
	public String getCompany() {
		return this.company;
	}
	private String getEngine() {
		return this.engine;	
	}
	public int getSpeed() {
		String a = getEngine();
		if(a == "800") {
			return 90;
		}else {
			return 120;
		}
	}

	public String getInfo() {
		return "this is a vehicle";
	}

public static String getVehicle() {
	return "You have set the same and color of that vehicle";
}
}