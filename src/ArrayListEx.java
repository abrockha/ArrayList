import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>(5);
		int sum = 0;
		int prod = 1;
		int largest;
		int small;
		
		System.out.println("Please enter 5 numbers.");
		for (int i=0; i<5 ; i++) {
		System.out.println("Number " + (i+1) + ": ");
		numbers.add(Integer.parseInt(scanner.nextLine()));
		
		sum += numbers.get(i);
		prod *= numbers.get(i);
		
		}
		
		Collections.sort(numbers);
		largest = numbers.get(4);
		small = numbers.get(0);
		
		System.out.println("The sum of the array list is, " + sum);
		System.out.println("The product of the array list is, " + prod);
		System.out.println("The largest number of the array list is, " + largest);
		System.out.println("The smallest number of the array list is, " + small);
		
		
		scanner.close();
	}
	
	
	
	}


