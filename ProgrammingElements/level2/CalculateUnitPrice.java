package ProgrammingElements.level2;
import java.util.*;

public class CalculateUnitPrice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int unitPrice = sc.nextInt();
		int quantity = sc.nextInt();
		
		int price = unitPrice*quantity;
		System.out.println("The total purchase price is INR "+price+"if the quantity "+quantity+" and unit price is INR "+unitPrice);
	}

}
