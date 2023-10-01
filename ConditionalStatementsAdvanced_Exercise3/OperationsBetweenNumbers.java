package ConditionalStatementsAdvanced_Exercise3;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double result = 0;
        String evenOrOdd = "";


        switch (operator){
            case "+":
                result = firstNumber + secondNumber;
                if (result % 2 == 0){
                    evenOrOdd = "even";
                }else {
                    evenOrOdd = "odd";
                }
                System.out.printf("%d %s %d = %.0f - %s", firstNumber, operator, secondNumber, result, evenOrOdd);
                break;

            case "-":
                result = firstNumber - secondNumber;
                if (result % 2 == 0){
                    evenOrOdd = "even";
                }else {
                    evenOrOdd = "odd";
                }
                System.out.printf("%d %s %d = %.0f - %s", firstNumber, operator, secondNumber, result, evenOrOdd);
                break;

            case "*":
                result = firstNumber * secondNumber;
                if (result % 2 == 0){
                    evenOrOdd = "even";
                }else {
                    evenOrOdd = "odd";
                }
                System.out.printf("%d %s %d = %.0f - %s", firstNumber, operator, secondNumber, result, evenOrOdd);
                break;

            case "/":
                if (secondNumber == 0){
                    System.out.printf("Cannot divide %d by zero", firstNumber);
                }else {
                    result = firstNumber * 1.0 / secondNumber;
                    System.out.printf("%d %s %d = %.2f", firstNumber, operator, secondNumber, result);
                }
                break;

            case "%":
                if (secondNumber == 0){
                    System.out.printf("Cannot divide %d by zero", firstNumber);
                }else {
                    result = firstNumber % secondNumber;
                    System.out.printf("%d %s %d = %.0f" , firstNumber, operator, secondNumber, result);
                }
                break;

                }

        }

}
