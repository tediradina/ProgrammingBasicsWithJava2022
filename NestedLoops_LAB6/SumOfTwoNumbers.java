package NestedLoops_LAB6;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startInterval = Integer.parseInt(scanner.nextLine());
        int endInterval = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int numberChecked = 0;

        for (int i = startInterval; i <= endInterval; i++){
            for (int j = startInterval; j <= endInterval; j++){
                numberChecked++;
                int result = i + j;
                if (result == magicNumber){
                    System.out.printf("Combination N:%d (%d + %d = %d)", numberChecked, i, j, magicNumber);
                    return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d", numberChecked, magicNumber);
    }
}
