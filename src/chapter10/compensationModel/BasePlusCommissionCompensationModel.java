package chapter10.compensationModel;

public class BasePlusCommissionCompensationModel extends CommissionCompensationModel{
    private double baseSalary;
    public BasePlusCommissionCompensationModel(double commissionRate, double grossSales, double baseSalary) {
        super(commissionRate, grossSales);
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary must be > 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary must be > 0.0");
        }
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings(){
        return super.earnings() + getBaseSalary();
    }

    @Override
    public String toString() {
        return String.format("%s%n%s: $%,.2f",
                super.toString(),
                "base salary", getBaseSalary());
    }

}
