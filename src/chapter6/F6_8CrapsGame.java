package chapter6;

import java.security.SecureRandom;

public class F6_8CrapsGame {
    private static final SecureRandom randomNumber = new SecureRandom();
    private static enum Status {WON, LOST, CONTINUE};

    private static final int SNAKE = 2;
    private static final int JAVA = 3;
    private static final int PYTHON = 7;
    private static final int ORALE = 11;
    private static final int BITE = 12;

    public static int rollDice(){
        int roll1 = 1 + randomNumber.nextInt(6);
        int roll2 = 1 + randomNumber.nextInt(6);

        int sumOfRoll = roll1 + roll2;
        System.out.printf("player rolled %d + %d = %d%n", roll1, roll2, sumOfRoll);

        return sumOfRoll;
    }

    public static void main(String[] args) {
        int myPoint = 0;
        Status gameStatus;
        int sumOfDice = rollDice();

        switch (sumOfDice){
            case PYTHON:
            case ORALE:
                gameStatus = Status.WON;
                break;
            case SNAKE:
            case JAVA:
            case BITE:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("the point is %d%n", myPoint);
                break;
        }
        while (gameStatus == Status.CONTINUE){
            sumOfDice = rollDice();

            if (sumOfDice == myPoint){
                gameStatus = Status.WON;
            }
            else {
                if (sumOfDice == PYTHON){
                    gameStatus = Status.LOST;
                }
            }
        }
        if (gameStatus == Status.WON){
            System.out.println("player wins");

        }
        else{
            System.out.println("player losses");
        }
    }
}
