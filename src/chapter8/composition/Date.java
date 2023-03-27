package chapter8.composition;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year){
        if (day <= 0 || day > 31){
            throw new IllegalArgumentException("day should be 1 - 31");
        }
        if (month <= 0 || month > 12 ){
            throw new IllegalArgumentException("month should be 1 - 12");
        }
        this.day = day;
        this.month= month;
        this.year = year;
    }
    public String toString(){
        return String.format("%d/%d/%d", day, month, year);
    }
}
