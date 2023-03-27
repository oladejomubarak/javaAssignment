package chapter10.payableModification;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);

        if(wage < 0.0){
            throw new IllegalArgumentException("Wage shouldn't be < 0.0");
        }

        if(hours <= 0 || hours > 168){
            throw new IllegalArgumentException("Hours shouldn't be < 0 || > 168");
        }

        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if(wage < 0.0){
            throw new IllegalArgumentException("Wage shouldn't be < 0.0");
        }
        this.wage = wage;
    }

    public double getHours() {
        if(hours < 0.0 || hours > 168){
            throw new IllegalArgumentException("Hours shouldn't be < 0.0 || > 168");
        }
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double getPaymentAmount(){
        if(getHours() <= 40){
            return getWage() * getHours();
        }else{
            return ((getWage() * 40) + ((getHours() - 40) * (getWage() * 1.5)));
        }

    }

    @Override
    public String toString() {
        return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
                super.toString(), "hourly wage", getWage(),
                "hours worked", getHours());
    }

}
