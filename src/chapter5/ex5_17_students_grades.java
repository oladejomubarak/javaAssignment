package chapter5;

import java.util.Scanner;

public class ex5_17_students_grades {
    private static final Scanner input = new Scanner(System.in);
    private static int counter = 0;
    private static int numberOfA;
    private static int numberOfB;
    private static int numberOfC;
    private static int numberOfD;
    public static void main(String[] args) {
        while (counter < 5){
            System.out.println("Enter your name: ");
            String studentName = input.nextLine();
            System.out.println("Enter your grade");
            String studentGrade = input.nextLine();
            switch (studentGrade) {
                case "A" -> ++numberOfA;
                case "B" -> ++numberOfB;
                case "C" -> ++numberOfC;
                case "D" -> ++numberOfD;
            }
            counter++;

        }
        if (numberOfA > 1){System.out.printf("The number of students that got A are %d%n", numberOfA);}
        else{System.out.printf("The number of students that got A is %d%n", numberOfA);}

        if (numberOfB > 1){System.out.printf("The number of students that got B are %d%n", numberOfB);}
        else{System.out.printf("The number of students that got B is %d%n", numberOfB);}

        if (numberOfC > 1){System.out.printf("The number of students that got C are %d%n", numberOfC);}
        else{System.out.printf("The number of students that got C is %d%n", numberOfC);}

        if (numberOfD > 1){System.out.printf("The number of students that got D are %d%n", numberOfD);}
        else{System.out.printf("The number of students that got D is %d%n", numberOfD);}



    }
}
