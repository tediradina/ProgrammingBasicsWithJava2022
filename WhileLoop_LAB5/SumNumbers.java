package WhileLoop_LAB5;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int sumNumbers = Integer.parseInt(scanner.nextLine());
        int sum = sumNumbers;
        number = number - sumNumbers;
        while (number > 0){
            sumNumbers = Integer.parseInt(scanner.nextLine());
            number = number - sumNumbers;
            sum = sum + sumNumbers;
        }
        System.out.println(sum);
    }

}
