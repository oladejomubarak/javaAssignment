package chapter8.composition;

public class Employee {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hiredDate;

    public Employee(String firstName, String lastName, Date birthDate, Date hiredDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hiredDate = hiredDate;
    }
    public String toString(){
        return String.format("%s, %s%nbirth date: %s%nhired date: %s", firstName, lastName, birthDate, hiredDate);
    }
}
