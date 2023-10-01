package NestedLoops_LAB6;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();

        while (!destination.equals("End")){
            double neededMoney = Double.parseDouble(scanner.nextLine());
            while (neededMoney > 0) {
                double saveMoney = Double.parseDouble(scanner.nextLine());
                neededMoney = neededMoney - saveMoney;
            }
            System.out.printf("Going to %s!%n", destination);

        destination = scanner.nextLine();
        }
    }
}
