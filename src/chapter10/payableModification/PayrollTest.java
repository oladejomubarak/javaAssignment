package chapter10.payableModification;

public class PayrollTest {
    public static void main(String[] args) {
        Payable[] payable = new Payable[]{
                new Invoice("3456", "seat", 2, 375.00),
                new Invoice("56789", "tyre", 4, 79.95),
                new SalariedEmployee("Tom", "Ser", "111-1334", 500.00),
                new HourlyEmployee("Dede", "Iea", "564-9023", 1000, 20),
                new CommissionEmployee("Ano", "Tewa", "267-8568", 0.4, 400),
                new BasePlusCommissionEmployee("Ali", "Sen", "675-9343", 0.6, 500, 400)

        };

        for(Payable payables : payable){
            System.out.printf("%s%n", payables);


            if (payables instanceof BasePlusCommissionEmployee){
                BasePlusCommissionEmployee newPayable = (BasePlusCommissionEmployee) payables;
                newPayable.setBaseSalary(1.10 * newPayable.getBaseSalary());

                System.out.printf("%s: $%,.2f%n","The new base salary with 10% increase is", newPayable.getBaseSalary());
            }
            System.out.printf("Amount paid: $%,.2f%n%n", payables.getPaymentAmount());
        }

        for(int i = 0; i < payable.length; i++){
            System.out.printf("Payable %d is a %s%n",i, payable[i].getClass().getName());
        }
    }


}
