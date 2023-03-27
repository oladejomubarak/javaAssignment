package chapter8.countingObjectCreation;

public class StudentTest {
    public static void main(String[] args) {
        System.out.println("no of students before creation: "+ Student.getCount());
        Student s1 = new Student("Mub", "Ola");
        System.out.println("After creating first student: " + s1.getCount());
        Student s2 = new Student("Muk", "bla");
        System.out.println("After creating Muk: "+ Student.getCount());

    }
}
