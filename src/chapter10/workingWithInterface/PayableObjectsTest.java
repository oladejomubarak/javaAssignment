package chapter10.workingWithInterface;

public class PayableObjectsTest {
    public static void main(String[] args) {
        Payable [] payableObjects = new Payable[] {
            new Invoice("1234", "gear", 5, 80.4),
            new Invoice("9090", "stirring", 4, 50.4),
                new SalariedEmployee("Oladejo", "Mubarak", "12234456", 800.00),
                new SalariedEmployee("Oladejo", "Abdus-Somad", "2389754",1750.00 )
        };

        System.out.println("Processing Employee and Invoices objects  polymorphically:  ");
        for (Payable payable : payableObjects ) {
            System.out.printf("%n%s%nPayment to be made: $%,.2f%n", payable, payable.getPaymentAmount());
        }
    }
}
