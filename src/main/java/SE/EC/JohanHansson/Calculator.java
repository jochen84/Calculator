package SE.EC.JohanHansson;


import java.util.Scanner;

public class Calculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean keepAlive = true;
        boolean wrongInput = true;
        System.out.println("1. Start the Calculator\n2. Quit");
        int quit = scanner.nextInt();
        if(quit == 2) {
            System.out.println("Quitting");
            System.exit(0);
        }

        while (keepAlive) {

            System.out.println("Type in two numbers:");
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();

            while (wrongInput){
            System.out.println("What do you want to do: +   -   /   *");
            char operator = scanner.next().charAt(0);
            double answer = 0.0;
            switch (operator) {
                case '+':
                    answer = getAddition(num1, num2);
                    wrongInput = false;
                    break;
                case '-':
                    answer = getSubtraction(num1, num2);
                    wrongInput = false;
                    break;
                case '*':
                    answer = getMultiplication(num1, num2);
                    wrongInput = false;
                    break;
                case '/':
                    answer = getDivision(num1, num2);
                    wrongInput = false;
                    break;
                default:
                    badInput(operator);
                    wrongInput = true;

            }
            }
            System.out.println("Vill du köra igen? (y/n)");
            //char fungerar, men skriver jag en String likadant stannar den inte o väntar på input? (Skriver jag som nu 2st scanner funkar det, varför?)
            scanner.nextLine();
            String yesno = scanner.nextLine();
            // char yesno = scanner.next().charAt(0);
            switch (yesno){

                case "n":
                    keepAlive = false;
                    break;
                case "y":
                    keepAlive = true;
                    wrongInput = true;
                    break;


            }
        }
    }

    //Addition method here
    static double getAddition(double firstNum, double secondNum) {
        System.out.println("The result is: " + (firstNum + secondNum));
        return firstNum + secondNum;
    }
    //Subtraction method
    static double getSubtraction(double firstNum, double secondNum){
        System.out.println("The result is: " + (firstNum - secondNum));
        return firstNum - secondNum;
    }
    //Multiplication method
    static double getMultiplication(double firstNum, double secondNum){
        System.out.println("The result is: " + (firstNum * secondNum));
        return firstNum * secondNum;
    }
    //Devision method
    static double getDivision(double firstNum, double secondNum){
        System.out.println("The result is: " + (firstNum / secondNum));
        return firstNum / secondNum;
    }
    //Wrong input of
    static void badInput(char operator){
        System.out.println("Unreqognized input, try again");
    }

    /*
    //Addition method here
    static void getAddition(double firstNum, double secondNum) {
        System.out.println("The result is: " + (firstNum + secondNum));
    }
    //Subtraction method
    static void getSubtraction(double firstNum, double secondNum){
        System.out.println("The result is: " + (firstNum - secondNum));
    }
    //Multiplication method
    static void getMultiplication(double firstNum, double secondNum){
        System.out.println("The result is: " + (firstNum * secondNum));
    }
    //Devision method
    static void getDivision(double firstNum, double secondNum){
        System.out.println("The result is: " + (firstNum / secondNum));
    }
    //Wrong input of
    static void wrongInput(char operator){
        System.out.println("Unreqognized input, try again");
    }

    */

}
