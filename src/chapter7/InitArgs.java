package chapter7;

public class InitArgs {
    public static void main(String[] args) {
        if (args.length != 3){
            System.out.println("Enter correct number of argument including the array size, initial value and increment");
        }
        else{
            int arrayLength = Integer.parseInt(args[0]);
            int[] arrayName = new int[arrayLength];

            int initialValue = Integer.parseInt(args[1]);
            int valueIncrement = Integer.parseInt(args[2]);

            for (int counter = 0; counter < arrayName.length; counter++ ){
                arrayName[counter] = initialValue + counter *  valueIncrement;
            }

                System.out.printf("%s%8s%n", "Index", "Value" );
            for (int counter = 0; counter < arrayName.length; counter++){
                System.out.printf("%5d%8d%n", counter, arrayName[counter]);
            }
        }

    }
}
