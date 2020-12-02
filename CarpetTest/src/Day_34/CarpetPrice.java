package Day_34;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CarpetPrice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter th width of the room: ");
		double width = scan.nextDouble();
		System.out.print("Enter th length or the room: ");
		double length = scan.nextDouble();
		System.out.print("Enter the price of the carpet/sqrm: $");
		double cost = scan.nextDouble();
		
		Floor floor = new Floor(width, length);		
		Carpet carpet = new Carpet(cost);
		Calculator price = new Calculator(floor, carpet);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Your total price for carpeting: $" + df.format(price.getTotalCost()));
		

	}

}
