import java.util.ArrayList;
import java.util.List;

public class Cashier {
    private List<Item> currentSaleItems; // List of items in the current sale
    private boolean isSaleShelved; // To check if sale is shelved

    public Cashier() {
        this.currentSaleItems = new ArrayList<>();
        this.isSaleShelved = false;
    }

    // Add an item to the current sale by scanning its barcode
    public void addItemToSale(Item item) {
        currentSaleItems.add(item);
        System.out.println(item.getName() + " has been added to the sale.");
    }

    // Remove an item from the current sale
    public void removeItemFromSale(Item item) {
        if (currentSaleItems.remove(item)) {
            System.out.println(item.getName() + " has been removed from the sale.");
        } else {
            System.out.println("Item not found in the current sale.");
        }
    }

    // Shelf the sale while the customer retrieves their wallet
    public void shelfSale() {
        this.isSaleShelved = true;
        System.out.println("The sale has been shelved. You can serve other customers.");
    }

    // Complete a sale using a credit card
    public void processCreditCardPayment(Customer customer, double amount) {
        System.out.println("Processing credit card payment for amount: " + amount);
        customer.payWithCreditCard(amount);
    }

    // Complete a sale using cash
    public void processCashPayment(Customer customer, double amount) {
        System.out.println("Processing cash payment for amount: " + amount);
        customer.payWithCash(amount);
    }

    // Calculate change to return to customer
    public double calculateChange(double payment, double totalAmount) {
        if (payment >= totalAmount) {
            double change = payment - totalAmount;
            System.out.println("Change to return: " + change);
            return change;
        } else {
            System.out.println("Insufficient payment.");
            return 0;
        }
    }

    // Apply a discount to an item (for near expiry items)
    public void applyDiscount(Item item, double discountPercentage) {
        double newPrice = item.getPrice() * (1 - discountPercentage / 100);
        item.setPrice(newPrice);
        System.out.println("Discount applied. New price for " + item.getName() + ": " + newPrice);
    }
}
