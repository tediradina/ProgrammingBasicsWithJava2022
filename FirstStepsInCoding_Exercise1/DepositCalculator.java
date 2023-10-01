package FirstStepsInCoding_Exercise1;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposited = Double.parseDouble(scanner.nextLine());
        int termMonth = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        double sum = deposited + termMonth * (((deposited * percentage) / 100) / 12);
        System.out.println(sum);
    }
}
