package chapter10.workingWithInterface;

public class Invoice implements Payable{
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem){
        if(quantity < 0){
            throw new IllegalArgumentException("quantity should not be less than zero");
        }
        if(pricePerItem <= 0.0){
            throw new IllegalArgumentException("price not be less than or equal to zero");
        }
        this.partNumber=partNumber;
        this.partDescription=partDescription;
        this.quantity= quantity;
        this.pricePerItem= pricePerItem;
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
    public String toString(){
        return String.format("%s:%s%n%s:%s%n%s:%d%n%s:%.2f", "Part Number", getPartNumber(), "Part Description", getPartDescription(),
        "Quantity", getQuantity(), "Price", getPricePerItem());
    }

    @Override
    public double getPaymentAmount() {
        double totalAmount;
        totalAmount = getPricePerItem()*getQuantity();
        return totalAmount;

    }
}
