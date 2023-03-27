package chapter10.compensationModel;

public class SalariedCompensationModel implements CompensationModel{
    private double weeklySalary;
    public SalariedCompensationModel(double weeklySalary){
        if(weeklySalary < 0.0){
            throw new IllegalArgumentException("Weekly salary should be > 0.0");
        }

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

    public double earnings(){
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%,.2f","Salaried employee",
                super.toString(), "weekly salary", getWeeklySalary());
    }


}
