package chapter10.payableModification;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);

        if(weeklySalary < 0.0){
            throw new IllegalArgumentException("Weekly salary should be > 0.0");
        }
        this.weeklySalary = weeklySalary;
    }
    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if(weeklySalary < 0.0){
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        }

        this.weeklySalary = weeklySalary;
    }
    @Override
    public double getPaymentAmount(){
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%,.2f","Salaried employee",
                super.toString(), "weekly salary", getWeeklySalary());
    }

}
