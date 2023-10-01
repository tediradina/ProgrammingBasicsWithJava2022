package WhileLoop_LAB5;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int minValue = Integer.MAX_VALUE;

        while (!input.equals("Stop")){
            if (minValue >= Integer.parseInt(input)) {
                minValue = Integer.parseInt(input);
            }
            input = scanner.nextLine();
        }
        System.out.println(minValue);
    }
}
