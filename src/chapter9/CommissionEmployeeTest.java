package chapter9;

public class CommissionEmployeeTest {
    public static void main(String[] args) {


        CommissionEmployee employee = new CommissionEmployee("Oladejo", "Mubarak",
                "2222", 3000, 0.3);

        System.out.println("using get methods: ");
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(employee.getGrossSales());
        System.out.println(employee.getCommissionRate());

        employee.setCommissionRate(0.6);
        employee.setGrossSales(7000);

        System.out.println(employee);
    }
}