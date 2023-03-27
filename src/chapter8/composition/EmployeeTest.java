package chapter8.composition;

public class EmployeeTest {
    public static void main(String[] args) {
        Date birth = new Date(18, 6, 1996);
        Date hired = new Date(3, 12, 2017);
        Employee employee = new Employee("Oladejo", "Mubarak", birth, hired);

        System.out.println(employee);
    }
}
