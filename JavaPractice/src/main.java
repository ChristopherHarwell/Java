import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// call the constructor
		Car car1 = new Car("civic", "black", "2012", "honda", "900", false, true);
		System.out.println(car1.getLedScreen());
		System.out.println(car1.getName());
		
		
		vehicle vehicle1 = new vehicle("civic", "black", "2012", "honda", "900");
		System.out.println(vehicle1.getInfo());
		vehicle car = new Car("civic", "black", "2012", "honda", "900", false, true);
		System.out.println(car.getInfo());
		vehicle bike = new bike("Mongoose","Black","Rough Rider","Huffy","300cc",true);
		System.out.println(bike.getInfo());
	}

}
