import java.util.Scanner;
import java.util.*;

public class FindCost3 {
  public static void main(String[] args) {
    Scanner keybaord = new Scanner(System.in);
    double price, tax;
    System.out.println("*** Product Price Check ***");
    System.out.print("Enter initial price: "); // prompt for input
    price = keybaord.nextDouble(); // input method called
    System.out.print("Enter new tax rate "); // prompt for input
    tax = keybaord.nextDouble(); // input method called
    price = price * (1 + tax / 100); // perform calculation
    System.out.print("Cost after tax = " + price);
  }
}
