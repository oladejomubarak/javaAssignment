package receipt;

public class Product {
    private String name;
    private int quantity;
    private double unitPrice;
    private String item;

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public Product(String item, int quantity, double unitPrice) {
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.item = item;
    }

    public String getItem() {
        return item;
    }

}
