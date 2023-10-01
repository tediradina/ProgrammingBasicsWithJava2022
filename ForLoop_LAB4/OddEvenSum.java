package ForLoop_LAB4;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countRepeat = Integer.parseInt(scanner.nextLine());
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 1; i <= countRepeat; i++){
            int number = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0){
                evenSum = evenSum + number;
            }else {
                oddSum = oddSum + number;
            }
        }
        if (oddSum == evenSum){
            System.out.println("Yes");
            System.out.printf("Sum = %d", evenSum);
        }else {
            System.out.println("No");
            int diff = Math.abs(evenSum - oddSum);
            System.out.printf("Diff = %d", diff);
        }
    }
}
