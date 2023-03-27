package chapter10.compensationModel;

public class CompensationModelTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Yao", "Aon", "7453-2343", new SalariedCompensationModel(200));
        Employee employee2 = new Employee("Ake", "Fom", "234-8946", new HourlyCompensationModel(100, 32));
        Employee employee3 = new Employee("Inu", "Dem", "678-9672", new CommissionCompensationModel(0.6,  100));
        Employee employee4 = new Employee("Adu", "Dew", "876-9452", new BasePlusCommissionCompensationModel(0.3,  3000, 300));

        System.out.printf("%s%n%n", employee1);
        System.out.printf("%s%n%n", employee2);
        System.out.printf("%s%n%n", employee3);
        System.out.printf("%s%n%n", employee4);

        employee2.setCompensationModel(new CommissionCompensationModel(0.4, 0.7));
        System.out.println(employee2);
    }

}
