package WhileLoop_LAB5;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double balance = 0;

        while (!input.equals("NoMoreMoney")){
            if (Double.parseDouble(input) < 0){
                System.out.println("Invalid operation!");
                break;
            }else {
                balance = balance + (Double.parseDouble(input));
                System.out.printf("Increase: %.2f%n", Double.parseDouble(input));

                input = scanner.nextLine();
            }
        }
        System.out.printf("Total: %.2f", balance);
    }
}
