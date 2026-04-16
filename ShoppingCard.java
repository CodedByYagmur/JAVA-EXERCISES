package MyPackage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	// Shopping card program
    	
    	Scanner input= new Scanner(System.in);
    	
    	String item;
    	double price;
    	int quantity;
    	char currency = '$';
    	double total;
    	
    	System.out.print("What item would like to buy?: ");
    	item = input.nextLine();
    	
    	System.out.print("What is the price for each?: ");
    	price = input.nextDouble();
    	
    	System.out.print("How many would you like?: ");
    	quantity= input.nextInt();
    	
    	total = price*quantity;
    	
    	System.out.print("\nYou have bought "+ quantity + " "+ item+ "/s");
    	System.out.print("\nYour total is "+ currency + total);
    	input.close();
    	
    	
      
    }
}
