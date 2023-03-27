package WorkOut6;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Mubarak";
        employee.birthDay = "12-04-1997";
        employee.hiredDay = "13-07-2020";
        employee.job = "Accountant";
        employee.salary = 50000;

        employee.promote(1000);
        double annualSalary = employee.calculateAnnualSalary();

        System.out.println("Annual Salary is : " + annualSalary);
        System.out.println("monthly salary is: " + employee.salary);
        Employee employee1= new Employee();
        employee1.name = "Mubarak";
        employee1.birthDay = "13-04-1995";
        employee1.hiredDay = "12-03-1997";
        employee1.job = "cleaner";
        employee1.salary= 5000;



    }
}
