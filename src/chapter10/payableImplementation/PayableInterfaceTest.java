package chapter10.payableImplementation;

public class PayableInterfaceTest {
    public static void main(String[] args) {
        Payable[] payable = new Payable[]{
                new Invoice("345-459", "Smallest", 3, 20),
                new Invoice("122-670", "Largest", 7, 23),
                new Employee("Ader", "Hot", "345-657", new SalariedCompensationModel(100))
        };

        for(Payable curPayable: payable){
            System.out.printf("%s", curPayable);
        }

        System.out.println();
    }

}
