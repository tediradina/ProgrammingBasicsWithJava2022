package ConditionalStatements_Exercise2;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ramMemory = Integer.parseInt(scanner.nextLine());

        double totalMoneyVideoCards = videoCards * 250;
        double totalMoneyProcessors = (totalMoneyVideoCards * 0.35) * processors;
        double totalMoneyRamMemory = totalMoneyVideoCards * 0.1 * ramMemory;
        double totalMoney = totalMoneyProcessors + totalMoneyRamMemory + totalMoneyVideoCards;
        if (videoCards > processors){
            totalMoney = totalMoney - (totalMoney * 0.15);
        }
        double difference = Math.abs(budget - totalMoney);
        if (budget >= totalMoney){
            System.out.printf("You have %.2f leva left!", difference);
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!", difference);
        }
    }
}
