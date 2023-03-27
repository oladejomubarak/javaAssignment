package chapter10.payableModification;

public class Invoice implements Payable{
    private final String partDescription;
    private final int quantity;
    private final double pricePerItem;
    private final String partNumber;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        if(pricePerItem < 0.0){
            throw new IllegalArgumentException("Price per Item must be > 0.0");
        }
        if(quantity < 0){
            throw new IllegalArgumentException("quantity must be > 0");
        }
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }
    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    @Override
    public double getPaymentAmount(){
        return getQuantity() * getPricePerItem();
    }

    @Override
    public String toString() {
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f",
                "invoice", "part number", getPartNumber(), getPartDescription(),
                "quantity", getQuantity(), "price per item", getPricePerItem());
    }

}
