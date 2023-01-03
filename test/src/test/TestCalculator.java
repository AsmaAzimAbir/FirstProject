package test;
import java.util.*;

public class TestCalculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		
		System.out.println("1st number: ");
		float a = sc.nextFloat();
		System.out.println("2nd number: ");
		float b = sc.nextFloat();
		
		System.out.println("\nAnswer is = "+cal.DoAddition(a, b));
		
		
	}

}
