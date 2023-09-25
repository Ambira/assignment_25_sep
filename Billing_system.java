import java.util.Scanner;

public class Billing_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int numberOfItems = sc.nextInt();

        double total = 0.0;
        double vat;
        double discount;

        String[] itemNames = new String[numberOfItems];
        int[] quantities = new int[numberOfItems];
        double[] prices = new double[numberOfItems];

        for (int i = 0; i < numberOfItems; i++) {
            sc.nextLine();
            System.out.print("Enter name of item " + (i + 1) + ": ");
            itemNames[i] = sc.nextLine();

            System.out.print("Enter quantity of item " + (i + 1) + ": ");
            quantities[i] = sc.nextInt();

            System.out.print("Enter price of item " + (i + 1) + ": ");
            prices[i] = sc.nextDouble();

            double itemCost = quantities[i] * prices[i];
            total += itemCost;
        }

        vat = 0.05 * total;
        discount = 0.10 * total;
        double finalTotal = total + vat - discount;

        System.out.println("\n************ Bill ********************");
        for (int i = 0; i < numberOfItems; i++) {
            System.out.println("Item " + (i + 1) + ": " + itemNames[i] + " - Nrp" + (quantities[i] * prices[i]));
        }
        System.out.println("Total: Nrp" + total);
        System.out.println("VAT (5%): Nrp" + vat);
        System.out.println("Discount (10%): Nrp" + discount);
        System.out.println("Final Total: Nrp" + finalTotal);

        sc.close();
    }
}
