package receipt;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CashReceipt {
    private static final Scanner input = new Scanner(System.in);
    private static String customerName;
    private static String purchaseItem;
    private static int itemQuantity;
    private static double pricePerUnit;
    private static int transactionCounter;
    private static Product[] shoppingCart = new Product[6];
    private static String cashierName;
    private static double discount;
    private static final double VAT = 2.52;
    private static double subTotal;

    public static double getPurchasePrice(Product product){
        double total = product.getUnitPrice() * product.getQuantity();
        return total;
    }
    public static double getBillTotal(double subTotal, double discount, double getVat){
        double billTotal = subTotal - (subTotal * (discount/100)) + getVat(subTotal);
        return billTotal;
    }
    public static double getVat(double subTotal){
        return ((VAT * subTotal) / 100);
    }




    public static void main(String[] args) {

        System.out.println("What is customer's name?");
        customerName = input.nextLine();
        boolean isExtraSales = true;
        int loop = 0;
        transactionCounter = 1;

        while (isExtraSales && loop < shoppingCart.length) {
            isExtraSales = false;

            System.out.println("What did the customer buy?");
            purchaseItem = input.nextLine();

            System.out.println("How many pieces?");
            itemQuantity = input.nextInt();

            System.out.println("How much per unit?");
            pricePerUnit = input.nextDouble();
            input.nextLine();

            Product product = new Product(purchaseItem, itemQuantity, pricePerUnit);
            shoppingCart[loop] = product;


            System.out.println("Add more items?");
            String buyMore = input.nextLine();
            if(buyMore.equals("yes")){
                transactionCounter+=1;
                isExtraSales = true;

                loop++;

            }
            else {

                System.out.print("Name of cashier: \n");
                cashierName = input.nextLine();

                System.out.println("How much discount will "+customerName+ " get?");
                discount = input.nextDouble();

            }
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE, dd-MM-yyyy, hh:mm:ss a");
        String myDate = formatter.format(LocalDateTime.now());
        LocalDateTime localDateTime = LocalDateTime.now();

        String receipt = String.format("""
                                    UNIQUE STORES
                                     MAIN BRANCH
                           LOCATION: 85, SULE MANAGER STREET, IWO RD, IBADAN.
                                  TEL: 08162768079
                                     DATE: %s
                                     CASHIER: %s
                                   CUSTOMER NAME: %s
               
               """,myDate, cashierName, customerName);

        System.out.println("\n".repeat(20));

        printHeaderFor(receipt);
        System.out.println();
        System.out.print("=".repeat(100));
        System.out.println();
        System.out.println("\t\tTHIS IS NOT A CASH RECEIPT. KINDLY PAY "+getBillTotal(subTotal,discount, getVat(subTotal)));
        System.out.print("=".repeat(100));
        System.out.println();

        System.out.println("\n".repeat(20));

        System.out.println("How much did the customer give you?");
        int amountPaid = input.nextInt();
        double customerBalance = amountPaid - getBillTotal(subTotal,discount, getVat(subTotal)) ;


        System.out.println("\n".repeat(50));

        printHeaderFor(receipt);
        System.out.println("\t\t\t\t\t Amount Paid : \t\t"+amountPaid);
        System.out.printf("%25s  : %13.03f","Balance",customerBalance);
        System.out.println();
        System.out.print("=".repeat(100));
        System.out.println();
        System.out.println("\t\t\tTHANK YOU FOR YOUR PATRONAGE!!!");
        System.out.print("=".repeat(100));
        System.out.println();
    }

    private static void printHeaderFor(String receipt) {
        System.out.println(receipt);
        System.out.println("=".repeat(100));
        System.out.println();
        System.out.println("\t\t\t\t ITEM\t\tQTY\t\tPRICE\t\tTOTAL(NGN)");
        System.out.println("-".repeat(100));
        System.out.println();
        System.out.println();

        for (int i = 0; i < transactionCounter; i++) {
            System.out.println("\t\t "+ shoppingCart[i].getItem()+"\t\t\t\t" + shoppingCart[i].getQuantity()+ "\t\t\t\t"
                    +shoppingCart[i].getUnitPrice()+"\t\t\t\t"
                    +getPurchasePrice(shoppingCart[i])+ "\t\t\t\t");
            subTotal += getPurchasePrice(shoppingCart[i]);
        }
        System.out.println();
        System.out.print("-".repeat(100));
        System.out.println();
        System.out.println("\t\t\t\t\t Sub Total: \t\t"+subTotal);
        System.out.println("\t\t\t\t\t Discount \t: \t\t"+discount);
        System.out.println("\t\t\t\t\t VAT @ "+ VAT +" : \t\t"+getVat(subTotal));
        System.out.print("-".repeat(100));
        System.out.println();
        System.out.println("\t\t\t\t\t Bill Total : \t\t"+getBillTotal(subTotal,discount, getVat(subTotal)));
    }
}
