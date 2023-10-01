package ForLoop_Exercise4;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countNumbers = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int maxNumber = 0;
        for (int i = 1; i <= countNumbers; i++){
            int number = Integer.parseInt(scanner.nextLine());
            sum = sum + number;
            if (maxNumber <= number){
                maxNumber = number;
            }
        }
        // Изваждам от сумата най-голямото число
        sum = sum - maxNumber;

        if (maxNumber == sum){
            System.out.println("Yes");
            System.out.printf("Sum = %d%n", sum);
        }else {
            int diff = Math.abs(maxNumber - sum);
            System.out.println("No");
            System.out.printf("Diff = %d%n", diff);
        }
    }
}
