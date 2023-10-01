package ConditionalStatementsAdvanced_Exercise3;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int countFisherman = Integer.parseInt(scanner.nextLine());
        double rent = 0;
        double discount = 0;

        switch (season){
            case "Spring":
                rent = 3000;
                break;

            case "Summer":
            case "Autumn":
                rent = 4200;
                break;

            case "Winter":
                rent = 2600;
                break;
        }

        if (countFisherman >=1 && countFisherman <= 6){
            discount = rent * 0.1;
        }else if (countFisherman > 6 && countFisherman <= 11){
            discount = rent * 0.15;
        }else if (countFisherman >= 12){
            discount = rent * 0.25;
        }

        double totalMoneyWithoutDiscount = rent - discount;

        if (countFisherman % 2 == 0 && (!season.equals("Autumn"))){
            totalMoneyWithoutDiscount = totalMoneyWithoutDiscount - (totalMoneyWithoutDiscount * 0.05);
        }


        double difference = Math.abs(budget - totalMoneyWithoutDiscount);
        if (budget >= totalMoneyWithoutDiscount){
            System.out.printf("Yes! You have %.2f leva left.", difference);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.",difference);
        }
    }
}
