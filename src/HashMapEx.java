import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String, String> vehicle = new HashMap<>();
		Scanner input = new Scanner(System.in);
		
		
		vehicle.put("Explorer", "Ford");
		vehicle.put("Civic", "Honda");
		vehicle.put("Tacoma", "Toyota");
		vehicle.put("Camaro", "Chevrolet");
		
		System.out.println("What model vehicle are you looking for?");
		String model = input.nextLine();
		
		if (vehicle.containsKey(model)) {
			String make = vehicle.get(model);
			System.out.println("Oh you're looking for " + model + ". Our " + make + " selection is over here.");
		}
		
		else {
			System.out.println("Sorry, we don't have that kind of vehicle here.");
		}
		
		
		input.close();
	}
	
	
}
