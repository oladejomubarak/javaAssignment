import brainstormFile.Account;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Ola Mub", 45.00 );
        Account account2 = new Account("Ade Mub", -10.00);

        System.out.printf("%s initial balance: %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s initial balance: %.2f%n", account2.getName(), account2.getBalance());
        Scanner input = new Scanner(System.in);
        System.out.println("input the amount: ");
         double depositAmount = input.nextDouble();
        System.out.printf("adding %.2f to account1 balance %n%n", depositAmount);
        account1.deposit(depositAmount);

        System.out.printf("%s new balance: %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s new balance: %.2f%n", account2.getName(), account2.getBalance());

        System.out.println("input the amount: ");
        depositAmount = input.nextDouble();
        System.out.printf("adding %.2f to account2 balance %n%n", depositAmount);
        account2.deposit(depositAmount);

        System.out.printf("%s new balance: %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s new balance: %.2f%n", account2.getName(), account2.getBalance());
    }
}
