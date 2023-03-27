package chapter10.compensationModel;

public class HourlyCompensationModel implements CompensationModel{
    private double wage;
    private double hours;

    public HourlyCompensationModel(double wage,double hours){
        if(wage < 0.0){
            throw new IllegalArgumentException("Wage should be > 0.0");
        }
        if(hours < 0 || hours > 168){
            throw new IllegalArgumentException("Hours should be > 0 and <= 168");
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
    public double earnings(){
        if(getHours() <= 40){
            return getWage() * getHours();
        }else{
            return ((getWage() * 40) + ((getHours() - 40) * (getWage() * 1.5)));
        }

    }


}
