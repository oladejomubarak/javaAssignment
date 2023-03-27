package WorkOut6;

public class Employee {

     String name;
     String birthDay;
     String hiredDay;
     String job;
    double salary;

     void promote(double amount){
         this.salary += amount;
     }
     double calculateAnnualSalary(){
         return this.salary * 12;
     }

}
