package chapter8;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Interest {
    public static void main(String[] args) {
        BigDecimal principal = BigDecimal.valueOf(1000);
        BigDecimal rate = BigDecimal.valueOf(0.05);
        System.out.printf("%-6s%-10s%n", "Year", "Amount on deposit");

        for (int year = 1; year <=10 ; year++) {
            BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));
            System.out.printf("%2d%15s%n", year, NumberFormat.getNumberInstance().format(amount));

        }
    }
}
