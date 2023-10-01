package ConditionalStatements_Exercise2;

import java.util.Scanner;

public class GodzillaVSKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int countExtras = Integer.parseInt(scanner.nextLine());
        double priceClothing = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1;
        if (countExtras > 150){
            priceClothing = priceClothing - (priceClothing * 0.1);
        }

        double neededMoney = countExtras * priceClothing + decor;
        double differenceMoney = Math.abs(budget - neededMoney);

        if (budget < neededMoney){
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", differenceMoney);
        }else {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", differenceMoney);
        }
    }
}