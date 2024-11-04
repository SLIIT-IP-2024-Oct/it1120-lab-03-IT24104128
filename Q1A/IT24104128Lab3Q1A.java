import java.util.Scanner;

public class IT24104128Lab3Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the price of 1 kg of rice
        System.out.print("Enter the price of 1 kg of rice: ");
        double pricePerKg = scanner.nextDouble();

        // Prompt user to enter the number of kilograms they want to buy
        System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = scanner.nextDouble();

        // Calculate the total amount to pay
        double totalAmount = pricePerKg * kilograms;

        // Display the total amount
        System.out.println("The total amount you have to pay is: " + totalAmount);
    }
}