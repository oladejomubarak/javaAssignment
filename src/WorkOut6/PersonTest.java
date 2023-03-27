package WorkOut6;

public class PersonTest {
    public static void main(String[] args) {


        Person person = new Person();
        person.name = "Mubarak";
        person.age = 5;

        person.oneMoreYear(10);
        int currentAge = person.birthday();
        System.out.println("name is : " + person.name);
        System.out.println("age is: " + currentAge);
    }
}