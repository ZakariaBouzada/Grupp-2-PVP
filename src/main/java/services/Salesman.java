import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Salesman {
    private Map<Item, Double> itemPrices; // Store prices of items
    private Map<String, SpecialOffer> specialOffers; // Store special offers

    public Salesman() {
        this.itemPrices = new HashMap<>();
        this.specialOffers = new HashMap<>();
    }

    // Set the price for a product
    public void setPrice(Item item, double price) {
        itemPrices.put(item, price);
        item.setPrice(price);
        System.out.println("Price set for " + item.getName() + ": " + price);
    }

    // Define a special offer for a specific time span
    public void defineSpecialOffer(String offerName, Item item, double discountPercentage, Date startDate, Date endDate) {
        SpecialOffer offer = new SpecialOffer(item, discountPercentage, startDate, endDate);
        specialOffers.put(offerName, offer);
        System.out.println("Special offer defined for " + item.getName() + ": " + discountPercentage + "% off");
    }

    // Get information about sold items (mockup function, needs integration with sales data)
    public void getSalesInfo(Date startDate, Date endDate) {
        // Mockup example
        System.out.println("Sales information between " + startDate + " and " + endDate + " retrieved.");
    }
}
