package WhileLoop_LAB5;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int maxValue = Integer.MIN_VALUE;

        while (!input.equals("Stop")){
            if (Integer.parseInt(input) >= maxValue){
                maxValue = Integer.parseInt(input);
            }
            input = scanner.nextLine();
        }
        System.out.println(maxValue);
    }
}
