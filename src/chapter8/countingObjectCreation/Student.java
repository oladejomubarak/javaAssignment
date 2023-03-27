package chapter8.countingObjectCreation;

public class Student {
    private String firstName;
    private String lastName;
    private static int count;

    public Student(String first, String last){
        firstName = first;
        lastName = last;

        count++;
    }

    public static int getCount() {
        return count;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
