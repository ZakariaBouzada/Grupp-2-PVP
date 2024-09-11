import java.util.Date;

public class SpecialOffer {
    private Item item;
    private double discountPercentage;
    private Date startDate;
    private Date endDate;

    public SpecialOffer(Item item, double discountPercentage, Date startDate, Date endDate) {
        this.item = item;
        this.discountPercentage = discountPercentage;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getter and setter methods
    public Item getItem() {
        return item;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }
}
